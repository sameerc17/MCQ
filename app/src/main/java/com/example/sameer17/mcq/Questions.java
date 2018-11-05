package com.example.sameer17.mcq;

public class Questions {

    public String nQuestions[]={
            "What is 1+1?",
            "What is 2+1?",
            "What is 4+3"

    };

    private String nChoices[][]={
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"3","7","5","6"}
        };

    private String nCorrectAnswers[]={
            "2","3","7"
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
