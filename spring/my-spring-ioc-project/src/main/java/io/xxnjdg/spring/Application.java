package io.xxnjdg.spring;

import java.lang.reflect.Field;
import java.util.Map;

public class Application {
    public static void main(String[] args) throws Exception {
//        XmlParser.parse("test.xml");
        BeanFactory beanFactory = new BeanFactory();
        for (Map.Entry<String, BeanDefinition> entry : beanFactory.map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        beanFactory.getBean("shutter");

//        Class<?> clazz = Class.forName("io.xxnjdg.spring.po.Edge");
//        Field name = clazz.getDeclaredField("11");

    }
}
