package org.abstractex;

public class MyNotebook extends Notebook {

    // Notebook에서 구현하지 않았던 typring을 구현하라고 한다.
    @Override
    public void typing() {
        System.out.println("MyNotebook Typing");
    }
}
