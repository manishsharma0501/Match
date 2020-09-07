package com.shaadi.match.data.db

import android.app.Application
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.shaadi.match.data.model.Match
import com.shaadi.match.data.net.MatchInfoProvider


// 1
@Database(entities = [Match::class], version = 1)
abstract class MatchDatabase : RoomDatabase() {

    abstract fun MatchDao(): MatchDao

    // 2
    companion object {
        private val lock = Any()
        private const val DB_NAME = "Match.db"
        private var INSTANCE: MatchDatabase? = null

        // 3
        fun getInstance(application: Application): MatchDatabase {
            synchronized(lock) {
                if (INSTANCE == null) {
                    INSTANCE =
                        Room.databaseBuilder(application, MatchDatabase::class.java, MatchDatabase.DB_NAME)
                            .allowMainThreadQueries()
                            .addCallback(object : RoomDatabase.Callback() {
                                override fun onCreate(db: SupportSQLiteDatabase) {
                                    super.onCreate(db)
                                    INSTANCE?.let {
                                        prePopulate(it, MatchInfoProvider.matchList)
                                    }
                                }
                            })
                            .build()
                }
                return INSTANCE!!
            }
        }

        fun prePopulate(database: MatchDatabase, MatchList: List<Match>) {
            for (Match in MatchList) {
                AsyncTask.execute { database.MatchDao().insert(Match) }
            }
        }


    }
}
