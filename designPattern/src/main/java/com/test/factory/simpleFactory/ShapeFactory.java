package com.test.factory.simpleFactory;

/**
 * 简单工厂
 *    简单工厂模式是由（一个）工厂（注意是一个！）对象决定创建出哪一种产品类的实例
     简单工厂是一个工厂只生产一类的产品,面对的是具体的类,
     实现方式的实质：由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类（这些产品类继承自一个父类或接口）的实例。
     简单工厂模式简单工厂模式的适用场景：
     （1）需要创建的对象较少。
     （2）客户端不关心对象的创建过程
 */
public class ShapeFactory {

    public static final String TAG = "ShapeFactory";

    public static Shape getShape(String type) {

        Shape shape = null;

        if (type.equalsIgnoreCase("circle")) {
            shape = new Circle();
        } else if (type.equalsIgnoreCase("rect")) {
            shape = new Square();
        } else if (type.equalsIgnoreCase("triangle")) {
            shape = new Triangle();
        }
        return shape;
    }
}
