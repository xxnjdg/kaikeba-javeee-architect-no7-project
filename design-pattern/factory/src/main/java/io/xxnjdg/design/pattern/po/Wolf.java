package io.xxnjdg.design.pattern.po;

import io.xxnjdg.design.pattern.util.FactoryClass;

@FactoryClass
public class Wolf {
    private String name;
    private Integer age;

    public Wolf() {
        name = "wolf";
        age = 12;
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
        return "Wolf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
