package io.xxnjdg.spring;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class XmlParser {
    public static Map<String, BeanDefinition> parse(String file) throws DocumentException, ClassNotFoundException {
        //1.创建Reader对象
        SAXReader reader = new SAXReader();
        String path = XmlParser.class.getResource("/" + file).getPath();
        //2.加载xml
        Document document = reader.read(new File(path));
        //3.获取根节点
        Element rootElement = document.getRootElement();
        Map<String, BeanDefinition> map = new HashMap<>();
        parseNode(rootElement, map, null);
        return map;
    }

    private static void parseNode(Element element, Map<String, BeanDefinition> map, String parentName) throws ClassNotFoundException {
        if (element == null) {
            return;
        }
        Iterator iterator = element.elementIterator();
        while (iterator.hasNext()) {
            Element stu = (Element) iterator.next();
            //处理bean子节点
            System.out.println(stu.getName());
            if ("bean".equals(stu.getName())) {
                BeanDefinition beanDefinition = new BeanDefinition();
                List<Attribute> attributes = stu.attributes();
                System.out.println("======获取属性值======");
                for (Attribute attribute : attributes) {
                    //处理id
                    if ("id".equals(attribute.getName())) {
                        beanDefinition.setId(attribute.getValue());
                    }
                    //处理class
                    if ("class".equals(attribute.getName())) {
                        beanDefinition.setClazz(Class.forName(attribute.getValue()));
                    }
                    if ("init-method".equals(attribute.getName())) {
                        beanDefinition.setInitMethod(attribute.getValue());
                    }
                }
                if (beanDefinition.getId() == null
                        || beanDefinition.getId().equals("")
                        || beanDefinition.getClazz() == null) {
                    throw new RuntimeException("id和class属性没有同时设置");
                }
                map.put(beanDefinition.getId(), beanDefinition);

                System.out.println("======遍历子节点======");
                parseNode(stu, map, beanDefinition.getId());
            }

            if ("property".equals(stu.getName())) {
                List<Attribute> attributes = stu.attributes();
                Property property = new Property();
                BeanDefinition beanDefinition = map.get(parentName);
                for (Attribute attribute : attributes) {
                    if ("name".equals(attribute.getName())) {
                        property.setName(attribute.getValue());
                    }

                    if ("value".equals(attribute.getName())) {
                        property.setValue(attribute.getValue());
                    }

                    if ("ref".equals(attribute.getName())) {
                        property.setRef(attribute.getValue());
                        property.setRef(true);
                    }
                }
                testNameAndValueAndRef(property.getName(), property.getValue(), property.getRef());
                beanDefinition.addProperty(property);
            }

            if ("constructor-arg".equals(stu.getName())) {
                List<Attribute> attributes = stu.attributes();
                ConstructorArg constructorArg = new ConstructorArg();
                BeanDefinition beanDefinition = map.get(parentName);
                for (Attribute attribute : attributes) {
                    if ("name".equals(attribute.getName())) {
                        constructorArg.setName(attribute.getValue());
                    }

                    if ("value".equals(attribute.getName())) {
                        constructorArg.setValue(attribute.getValue());
                    }

                    if ("ref".equals(attribute.getName())) {
                        constructorArg.setRef(attribute.getValue());
                        constructorArg.setIsRef(true);
                    }

                    if ("index".equals(attribute.getName())) {
                        constructorArg.setIndex(Integer.valueOf(attribute.getValue()));
                    }

                    if ("type".equals(attribute.getName())) {
                        constructorArg.setType(Class.forName(attribute.getValue()));
                    }
                }
                testNameAndValueAndRef(constructorArg.getName(),constructorArg.getValue(),constructorArg.getRef());
                beanDefinition.addConstructorArgs(constructorArg);
            }
        }
    }

    private static void testNameAndValueAndRef(String name, String value, String ref) {
        if (name == null || "".equals(name) || panDuan(value,ref)) {
            throw new RuntimeException("属性设置不正确");
        }
    }

    private static Boolean panDuan(String value, String ref) {
        if (value != null && ref != null) {
            return true;
        }

        if (value != null && !"".equals(value)) {
            return false;
        }

        return ref == null || "".equals(ref);
    }
}
