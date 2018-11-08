package com.example.sameer17.mcq;

public class Questions {

    public String nQuestions[]={
            "What is the capital of Afghanistan ?",
            "What is the capital of Australia ?",
            "What is 35 squared ?",
            "When did India become independent ?",
            "What does 'www' stand for in internet terminology?",
            "Who was the inventor of Radio ?"

    };

    private String nChoices[][]={
            {"Kabul","Tirana","Beijing","Houston"},
            {"Sydney","Canberra","Perth","Melbourne"},
            {"1335","1995","1295","1225"},
            {"1935","1905","1295","1947"},
            {"World Web Wide","World Wide Web","World Windows Web","Windows Wide Web"},
            {"Edison","Faraday","Marconi","Einstein"}


        };

    private String nCorrectAnswers[]={
            "Kabul","Canberra","1225","1947","World Wide Web","Marconi"
    };

    public String getQuestion(int s) {
        String question=nQuestions[s];
        return  question;
    }

    public  String getChoice1(int s) {
        String choice=nChoices[s][0];
        return choice;
    }

    public String getChoice2(int s) {
        String choice=nChoices[s][1];
        return choice;
    }

    public String getChoice3(int s) {
        String choice=nChoices[s][2];
        return choice;
    }

    public String getChoice4(int s) {
        String choice=nChoices[s][3];
        return choice;
    }

    public String getCorrect(int s) {
        String ca=nCorrectAnswers[s];
        return ca;
    }
}
