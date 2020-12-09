package io.xxnjdg.design.pattern.simple2;

//指挥者，这里去指定制作流程，返回产品
public class HighMapDirector {

    private AbstractMapBuilder abstractMapBuilder;

    //构造器传入 abstractMapBuilder
    public HighMapDirector(AbstractMapBuilder abstractMapBuilder) {
        this.abstractMapBuilder = abstractMapBuilder;
    }

    //如何处理建造地图的流程，交给指挥者
    public Map create(){
        return abstractMapBuilder
                .create_house()
                .create_tree()
                .create_way()
                .create_weather()
                .build();
    }
}
