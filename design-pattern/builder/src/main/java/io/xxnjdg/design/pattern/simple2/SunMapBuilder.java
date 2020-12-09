package io.xxnjdg.design.pattern.simple2;

//构造者
public class SunMapBuilder extends AbstractMapBuilder {
    @Override
    public AbstractMapBuilder create_weather() {
        this.map.setWeather("阳光");
        return this;
    }

    @Override
    public AbstractMapBuilder create_house() {
        this.map.setHouse("大房子");
        return this;
    }

    @Override
    public AbstractMapBuilder create_tree() {
        this.map.setTree("大树");
        return this;
    }

    @Override
    public AbstractMapBuilder create_way() {
        this.map.setWay("高速公路");
        return this;
    }
}
