package io.xxnjdg.design.pattern.simple2;

//产品，需要被创建的类
public class Map {
    private String weather;
    private String house;
    private String tree;
    private String way;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    @Override
    public String toString() {
        return "Map{" +
                "weather='" + weather + '\'' +
                ", house='" + house + '\'' +
                ", tree='" + tree + '\'' +
                ", way='" + way + '\'' +
                '}';
    }
}
