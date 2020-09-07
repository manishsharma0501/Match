package com.shaadi.match

import android.app.Application
import com.shaadi.match.data.MatchRepository

class MatchApp : Application() {

    /**
     * Provides centralised Repository throughout the app
     */
    fun getPeopleRepository() = MatchRepository(this)

}