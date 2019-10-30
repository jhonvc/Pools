package com.example.tecsup.pools.Entidades;

import java.util.List;

public class Question {
  public   int id;
  public String question_text;
  public String String_public_date;
  public List<Choice>choices;
  public Question(){

   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion_text() {
        return question_text;
    }

    public void setQuestion_text(String question_text) {
        this.question_text = question_text;
    }

    public String getString_public_date() {
        return String_public_date;
    }

    public void setString_public_date(String string_public_date) {
        String_public_date = string_public_date;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }
}
