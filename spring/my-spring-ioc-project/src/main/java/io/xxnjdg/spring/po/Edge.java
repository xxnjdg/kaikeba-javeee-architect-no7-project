package io.xxnjdg.spring.po;

import java.util.Objects;

public class Edge {
    private String name;
    private Integer age;

    public Edge() {
    }

    public Edge(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(name, edge.name) &&
                Objects.equals(age, edge.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

