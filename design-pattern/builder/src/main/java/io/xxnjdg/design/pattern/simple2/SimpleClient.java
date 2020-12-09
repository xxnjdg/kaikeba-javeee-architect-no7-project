package io.xxnjdg.design.pattern.simple2;

public class SimpleClient {
    public static void main(String[] args) {
        HighMapDirector highMap = new HighMapDirector(new SunMapBuilder());
        Map map = highMap.create();
        System.out.println(map);

        HighMapDirector highMap1 = new HighMapDirector(new WetMapBuilder());
        Map map1 = highMap1.create();
        System.out.println(map1);

        LowMapDirector lowMap = new LowMapDirector(new SunMapBuilder());
        Map map2 = lowMap.create();
        System.out.println(map2);

        LowMapDirector lowMap1 = new LowMapDirector(new WetMapBuilder());
        Map map3 = lowMap1.create();
        System.out.println(map3);
    }
}
