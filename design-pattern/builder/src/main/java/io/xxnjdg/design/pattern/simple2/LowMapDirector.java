package io.xxnjdg.design.pattern.simple2;

//指挥者，这里去指定制作流程，返回产品
public class LowMapDirector {
    private AbstractMapBuilder abstractMapBuilder;

    //构造器传入 abstractMapBuilder
    public LowMapDirector(AbstractMapBuilder abstractMapBuilder) {
        this.abstractMapBuilder = abstractMapBuilder;
    }

    //如何处理建造地图的流程，交给指挥者
    public Map create(){

        return abstractMapBuilder
                .create_weather()
                .create_way()
                .create_house()
                .build();
    }
}
