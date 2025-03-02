package io.xxnjdg.spring;

public class Property {
    private String name;
    private String value;
    private String ref;
    private Boolean isRef;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", ref='" + ref + '\'' +
                ", isRef=" + isRef +
                '}';
    }

    public void setRef(Boolean ref) {
        isRef = ref;
    }
}
