package com.example.tecsup.pools.Entidades;

public class Choice {
    public  int questions;
    public String choice_text;
    public int votes;

    public Choice() {

    }

    public Choice(int questions, String choice_text, int votes) {
        this.questions = questions;
        this.choice_text = choice_text;
        this.votes = votes;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }

    public String getChoice_text() {
        return choice_text;
    }

    public void setChoice_text(String choice_text) {
        this.choice_text = choice_text;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
