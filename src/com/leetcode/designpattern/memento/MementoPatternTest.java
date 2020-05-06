package com.leetcode.designpattern.memento;

public class MementoPatternTest {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder();
        text.append("Testing memento.").append("Saving first Text.");
        
        TextOriginator textOriginator = new TextOriginator();
        TextCaretaker textCaretaker = new TextCaretaker();
        textOriginator.setText(text);
        textCaretaker.save(textOriginator.createMemento(textOriginator));
        
        text.append("Saving second Text.");
        textCaretaker.save(textOriginator.createMemento(textOriginator));
        
        text.append("Saving third Text.");
        textCaretaker.save(textOriginator.createMemento(textOriginator));
        
        text.append("Saving forth Text.");

        textOriginator.restore(textCaretaker.restore());
        System.out.println(textOriginator.getText().toString());
    }
}
