package com.leetcode.designpattern.memento;

public class TextOriginator {

    private StringBuilder text;

    public TextMemento createMemento(TextOriginator textOriginator) {
        TextMemento textMemento = new TextMemento(textOriginator.getText().toString());
        return textMemento;
    }

    public void restore(TextMemento textMemento) {
        this.setText(new StringBuilder(textMemento.getText()));
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }
}
