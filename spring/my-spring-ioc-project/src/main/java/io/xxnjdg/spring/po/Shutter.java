package io.xxnjdg.spring.po;

import java.util.Objects;

public class Shutter {
    private String name;
    private Integer age;

    public Shutter() {
    }

    public Shutter(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Shutter(Integer name, String age) {

    }

    public Shutter(Integer age, Integer name) {

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
        return "Shutter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shutter shutter = (Shutter) o;
        return Objects.equals(name, shutter.name) &&
                Objects.equals(age, shutter.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
