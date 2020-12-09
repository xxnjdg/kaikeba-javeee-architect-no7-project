package io.xxnjdg.design.pattern;

/**
 * 饿汉式
 */
public class Type1 {
    private static final Type1 instance = new Type1();


    private Type1() {
    }

    public static Type1 getInstance(){
        return instance;
    }
}
