package io.xxnjdg.design.pattern;

/**
 * 懒汉式
 */
public class Type2 {

    private static class InternalClass{
        private static final Type2 instance = new Type2();
    }

    private Type2() {
    }

    public static Type2 getInstance(){
        return InternalClass.instance;
    }
}
