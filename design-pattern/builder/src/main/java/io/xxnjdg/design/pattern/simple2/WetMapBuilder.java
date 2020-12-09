package io.xxnjdg.design.pattern.simple2;

//构造者
public class WetMapBuilder extends AbstractMapBuilder {
    @Override
    public AbstractMapBuilder create_weather() {
        this.map.setWeather("阴天");
        return this;
    }

    @Override
    public AbstractMapBuilder create_house() {
        this.map.setHouse("小房子");
        return this;
    }

    @Override
    public AbstractMapBuilder create_tree() {
        this.map.setTree("小树");
        return this;
    }

    @Override
    public AbstractMapBuilder create_way() {
        this.map.setWay("国道");
        return this;
    }
}
