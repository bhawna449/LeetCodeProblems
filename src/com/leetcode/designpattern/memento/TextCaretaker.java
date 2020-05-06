package com.leetcode.designpattern.memento;

import java.util.Stack;

public class TextCaretaker {

    Stack<TextMemento> textOriginatorMemento = new Stack<>();

    public void save(final TextMemento textMemento) {
        textOriginatorMemento.push(textMemento);

    }

    public TextMemento restore() {
        return textOriginatorMemento.pop();
    }
}
