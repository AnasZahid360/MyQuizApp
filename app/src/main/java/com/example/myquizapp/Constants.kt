package com.example.myquizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()


        val que1 = Question(

            1, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Armenia","Austria",1
            )
        questionsList.add(que1)


        val que2 = Question(

            2, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_australia,
            "Angola","Australia","Armenia","Austria",2
        )
        questionsList.add(que2)


        val que3 = Question(

            3, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_brazil,
            "Belarus","Belize","Brunei","Brazil",4
        )
        questionsList.add(que3)


        val que4 = Question(

            4, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas","Belgium","Barbados","Belize",2
        )
        questionsList.add(que4)


        val que5 = Question(

            5, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_fiji,
            "Gabon","France","Fiji","Finland",3
        )
        questionsList.add(que5)


        val que6 = Question(

            6, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_germany,
            "Germany","Georgia","Greece","None Of These",1
        )
        questionsList.add(que6)


        val que7 = Question(

            7, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_denmark,
            "Dominica","Egypt","Denmark","Ethiopia",3
        )
        questionsList.add(que7)


        val que8 = Question(

            8, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_india,
            "Ireland","Iran","Hungary","India",4
        )
        questionsList.add(que8)


        val que9 = Question(

            9, "What Country Does This Flag Belongs To?",
            R.drawable.ic_flag_of_new_zealand,
            "New Zealand","Jordan","Sudan","Palestine",4
        )
        questionsList.add(que9)

        return questionsList

    }
}