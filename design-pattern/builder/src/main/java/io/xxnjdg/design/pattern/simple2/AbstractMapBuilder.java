package io.xxnjdg.design.pattern.simple2;

//抽象构造者
public abstract class AbstractMapBuilder {

    protected final Map map = new Map();

    public abstract AbstractMapBuilder create_weather();

    public abstract AbstractMapBuilder create_house();

    public abstract AbstractMapBuilder create_tree();

    public abstract AbstractMapBuilder create_way();

    public Map build(){
        return map;
    }
}

