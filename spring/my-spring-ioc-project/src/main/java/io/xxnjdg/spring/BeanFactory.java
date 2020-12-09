package io.xxnjdg.spring;

import org.dom4j.DocumentException;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.stream.Collectors;

public class BeanFactory {

    public Map<String, BeanDefinition> map = new HashMap<>();
    private Map<String, Object> singletonObjects = new HashMap<>();

    public BeanFactory() throws ClassNotFoundException, DocumentException {
        //解析
        map.putAll(XmlParser.parse("test.xml"));
    }

    public Object getBean(String id) throws Exception {
        if (id == null) {
            throw new RuntimeException("id为空");
        }

        Object o = singletonObjects.get(id);
        if (o != null) {
            return o;
        }

        BeanDefinition beanDefinition = map.get(id);
        if (beanDefinition == null) {
            throw new RuntimeException("没有这个bean名");
        }

        return crateBean(beanDefinition);
    }

    private Object createInstance(BeanDefinition beanDefinition) throws Exception {

        Class<?> clazz = beanDefinition.getClazz();

        List<ConstructorArg> constructorArgs = beanDefinition.getConstructorArgs();

        int size = constructorArgs.size();
        if (size <= 0) {
            return clazz.newInstance();
        }


        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
            System.out.println();
            if (constructor.getParameterCount() == size){
                Parameter[] parameters = constructor.getParameters();

                List<String> names = Arrays.stream(parameters).map(Parameter::getName)
                        .collect(Collectors.toList());

                boolean b = beanDefinition.getConstructorArgs().containsAll(names);

                if (!b){
                    continue;
                }

                for (Parameter parameter : parameters) {
                    Class<?> type = parameter.getType();
                    
                }


//                for (Parameter parameter : parameters) {
//                    System.out.println(parameter);
//
//                    //age name
//                    for (ConstructorArg constructorArg : beanDefinition.getConstructorArgs()) {
//                        String name = constructorArg.getName();
//                        if (name != null && name.equals(parameter.getName())){
//
//                        }
//                    }
//                }
            }
        }
        return null;
    }

    private Object crateBean(BeanDefinition beanDefinition) throws Exception {
        Class<?> clazz = beanDefinition.getClazz();
        //先创建bean
        Object instance = createInstance(beanDefinition);

        //属性注入
        for (Property property : beanDefinition.getProperty()) {
            String name = property.getName();
            Field field = clazz.getDeclaredField(name);
            field.setAccessible(true);
        }

        //bean初始化

        return null;
    }


}
