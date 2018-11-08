package com.example.sameer17.mcq;

public class Questions {

    public String nQuestions[]={
            "What is the capital of Afghanistan ?",
            "What is the capital of Australia ?",
            "What is 35 squared ?",
            "When did India become independent ?",
            "What does 'www' stand for in internet terminology?",
            "Who was the inventor of Radio ?",
            "Who won the football world cup in 2010 ?",
            "'Euro' is NOT the currency of which of the following countries ?",
            "What is the full form of ISP ?",
            "Who is the best footballer in the world ? (:p)"

    };

    private String nChoices[][]={
            {"Kabul","Tirana","Beijing","Houston"},
            {"Sydney","Canberra","Perth","Melbourne"},
            {"1335","1995","1295","1225"},
            {"1935","1905","1295","1947"},
            {"World Web Wide","World Wide Web","World Windows Web","Windows Wide Web"},
            {"Edison","Faraday","Marconi","Einstein"},
            {"Spain","Argentina","Brazil","Italy"},
            {"Germany","Spain","Macedonia","Luxembourg"},
            {"Intranet Service Procedure","Internet Service Procedure","Internet Service Provider","Internet Simulation Process"},
            {"Messi","Ronaldo","Di Stefano","Cruyff"}

        };

    private String nCorrectAnswers[]={
            "Kabul","Canberra","1225","1947","World Wide Web","Marconi","Spain","Macedonia","Internet Service Provider","Messi"
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
