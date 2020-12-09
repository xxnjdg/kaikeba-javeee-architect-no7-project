package io.xxnjdg.spring;

import java.util.ArrayList;
import java.util.List;

public class BeanDefinition {
    private String id;
    private Class<?> clazz;
    private String initMethod;
    private List<Property> property = new ArrayList<>();
    private List<ConstructorArg> constructorArgs = new ArrayList<>();

    public List<ConstructorArg> getConstructorArgs() {
        return constructorArgs;
    }

    public void addConstructorArgs(ConstructorArg constructorArgs) {
        this.constructorArgs.add(constructorArgs);
    }

    public List<Property> getProperty() {
        return property;
    }

    public void addProperty(Property property) {
        this.property.add(property);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public String getInitMethod() {
        return initMethod;
    }

    public void setInitMethod(String initMethod) {
        this.initMethod = initMethod;
    }


    @Override
    public String toString() {
        return "BeanDefinition{" +
                "id='" + id + '\'' +
                ", clazz=" + clazz +
                ", initMethod='" + initMethod + '\'' +
                ", property=" + property +
                ", constructorArgs=" + constructorArgs +
                '}';
    }
}
