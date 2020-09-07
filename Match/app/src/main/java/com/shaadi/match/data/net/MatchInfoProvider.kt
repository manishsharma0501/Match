package com.shaadi.match.data.net

import com.shaadi.match.data.model.Match

class MatchInfoProvider {

    companion object {
        var matchList = initMatchList()

        /**
         * Initialises peopleList with dummy data
         */
        private fun initMatchList(): MutableList<Match> {
            val peoples = mutableListOf<Match>()
            peoples.add(
                Match(
                "Ray Wenderlich",
                "RW Campus",
                "228-40332240",
                "ray@razeware.com",
                "facebook.com/raywenderlich",
                "twitter.com/rwenderlich",
                1)
            )
            peoples.add(Match(
                "Mark Tremonti",
                "Alter Bridge Concert",
                "228-44012312",
                "mark@alterbridge.com",
                "facebook.com/tremonti",
                "twitter.com/TremontiAB",
                2))
            peoples.add(Match(
                "Jeff Bezos",
                "Amazon HQ",
                "206-26622992",
                "j.bezos@amazon.com",
                "facebook.com/j.bezos",
                "twitter.com/Amazon",
                3))
            peoples.add(Match(
                "Mark Zuckerberg",
                "Facebook",
                "228-41124312",
                "mark@facebook.com",
                "facebook.com/mz",
                "twitter.com/MarkZ",
                4))
            peoples.add(Match(
                "Bil Gates",
                "Microsoft HQ",
                "206-24541837",
                "gates@microsoft.com",
                "facebook.com/b.gates",
                "twitter.com/MicrosoftUS",
                5))
            peoples.add(Match(
                "Tim Cook",
                "Apple, Cupertino",
                "310-27753123",
                "cook@apple.com",
                "facebook.com/t.cook",
                "twitter.com/AppleCA",
                6))
            peoples.add(Match(
                "Sundar Pichai",
                "Google CA",
                "310-46645322",
                "s.pichai@gmail.com",
                "facebook.com/s.pichai",
                "twitter.com/GoogleCEO",
                7))
            peoples.add(Match(
                "Elon Musk",
                "SpaceX Campus",
                "310-35666875",
                "musk@spacex.com",
                "facebook.com/e.musk",
                "twitter.com/SpaceX",
                8))
            return peoples
        }
    }
}