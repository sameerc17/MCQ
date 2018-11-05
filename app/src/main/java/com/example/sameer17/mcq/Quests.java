package com.example.sameer17.mcq;

public class Quests {
    String question;
    int correct = 0;
    String[] ans;

    public Quests(String question, int correct, String[] ans) {
        this.question = question;
        this.correct = correct;
        this.ans = ans;
    }

    public boolean isCorrect(int selected){
        return selected == this.correct;
    }
}
