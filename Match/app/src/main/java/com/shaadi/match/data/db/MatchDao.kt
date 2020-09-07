package com.shaadi.match.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shaadi.match.data.model.Match

@Dao
interface MatchDao {

    // 1: Select All
    @Query("SELECT * FROM Match ORDER BY id DESC")
    fun getAll(): LiveData<List<Match>>

    // 2: Insert
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(people: Match)

    // 3: Delete
    @Query("DELETE FROM Match")
    fun deleteAll()

    // 4: Select by id
    @Query("SELECT * FROM Match WHERE id = :id")
    fun find(id: Int): LiveData<Match>

    @Query("SELECT * FROM Match WHERE name LIKE '%' || :name || '%'")
    fun findBy(name: String): LiveData<List<Match>>

}
