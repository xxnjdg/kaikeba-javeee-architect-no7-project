package io.xxnjdg.spring.po;

import java.util.Objects;

public class YoYoFactory {
    private Edge edge;
    private Shutter shutter;

    public YoYoFactory() {
    }

    public YoYoFactory(Edge edge, Shutter shutter) {
        this.edge = edge;
        this.shutter = shutter;
    }

    public Edge getEdge() {
        return edge;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }

    public Shutter getShutter() {
        return shutter;
    }

    public void setShutter(Shutter shutter) {
        this.shutter = shutter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YoYoFactory that = (YoYoFactory) o;
        return Objects.equals(edge, that.edge) &&
                Objects.equals(shutter, that.shutter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge, shutter);
    }

    @Override
    public String toString() {
        return "YoYoFactory{" +
                "edge=" + edge +
                ", shutter=" + shutter +
                '}';
    }
}

