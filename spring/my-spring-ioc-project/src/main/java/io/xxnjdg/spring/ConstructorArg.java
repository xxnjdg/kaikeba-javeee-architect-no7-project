package io.xxnjdg.spring;

public class ConstructorArg {
    private String value;
    private String name;
    private String ref;
    private Boolean isRef;
    private Integer index;
    private Class<?> type;


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public Boolean getIsRef() {
        return isRef;
    }

    public void setIsRef(Boolean ref) {
        this.isRef = ref;
    }

    @Override
    public String toString() {
        return "ConstructorArg{" +
                "value='" + value + '\'' +
                ", name='" + name + '\'' +
                ", index=" + index +
                ", ref='" + ref + '\'' +
                ", type=" + type +
                ", isRef=" + isRef +
                '}';
    }
}
