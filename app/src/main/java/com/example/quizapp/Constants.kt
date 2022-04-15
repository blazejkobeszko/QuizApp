package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // 1
        val q1 = Question(
            1, "What name is traditionally given to the party held for a woman who is expecting a baby?",
            R.drawable.ic_baby,
            "Baby drizzle", "Baby shower",
            "Baby downpour", "Baby deluge", 2
        )
        questionsList.add(q1)

        // 2
        val q2 = Question(
            2, "In what year was the first iPhone released?",
            R.drawable.ic_iphone,
            "2000", "2004",
            "2007", "2009", 3
        )

        questionsList.add(q2)

        // 3
        val q3 = Question(
            3, "Which city will host the 2028 Olympic Games?",
            R.drawable.ic_olympics,
            "Beijing", "Paris",
            "Tokyo", "Los Angeles", 4
        )

        questionsList.add(q3)

        // 4
        val q4 = Question(
            4, "What style was this cathedral built in?",
            R.drawable.ic_building,
            "Renaissance", "Gothic",
            "Mannerist", "Neo-Gothic", 2
        )

        questionsList.add(q4)

        // 5
        val q5 = Question(
            5, "What country is in the picture?",
            R.drawable.ic_country,
            "Gabon", "Czech Republic",
            "Fiji", "Austria", 2
        )

        questionsList.add(q5)

        // 6
        val q6 = Question(
            6, "What car does this logo belong to?",
            R.drawable.ic_car_logo,
            "Acura", "Ateca",
            "Accord", "none of these", 1
        )

        questionsList.add(q6)

        // 7
        val q7 = Question(
            7, "What size footballs are used in matches?",
            R.drawable.ic_ball,
            "Size 4", "Size 6",
            "Size 5", "Size 7", 3
        )

        questionsList.add(q7)

        // 8
        val q8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(q8)

        // 9
        val q9 = Question(
            9, "What is name of this actor?",
            R.drawable.ic_actor,
            "Jake Gyllenhaal", "Jack Nicholson",
            "Kevin Spacey", "Robert Downey Jr.", 1
        )

        questionsList.add(q9)

        // 10
        val q10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(q10)
        return questionsList

    }
}