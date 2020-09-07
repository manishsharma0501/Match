package com.shaadi.match.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.shaadi.match.data.db.MatchDao
import com.shaadi.match.data.db.MatchDatabase
import com.shaadi.match.data.model.Match

class MatchRepository(application: Application) {

    private val MatchDao: MatchDao

    init {
        val MatchDatabase = MatchDatabase.getInstance(application)
        MatchDao = MatchDatabase.MatchDao()
    }

    fun getAllMatch(): LiveData<List<Match>> {
        return MatchDao.getAll()
    }

    fun insertMatch(Match: Match) {
        MatchDao.insert(Match)
    }

    fun findMatch(id: Int): LiveData<Match> {
        return MatchDao.find(id)
    }


    fun findMatch(name: String): LiveData<List<Match>> {
        return MatchDao.findBy(name)
    }

}
