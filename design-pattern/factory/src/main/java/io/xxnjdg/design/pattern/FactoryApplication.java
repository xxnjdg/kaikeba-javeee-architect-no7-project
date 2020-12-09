package io.xxnjdg.design.pattern;

import io.xxnjdg.design.pattern.po.Fox;
import io.xxnjdg.design.pattern.po.Wolf;
import io.xxnjdg.design.pattern.util.CustomFactory;

public class FactoryApplication {
    public static void main(String[] args) {
        CustomFactory customFactory = new CustomFactory("io.xxnjdg.design.pattern.po");
        Fox fox = (Fox)customFactory.create("fox");
        System.out.println(fox);
        Wolf wolf = (Wolf)customFactory.create("wolf");
        System.out.println(wolf);
    }
}
