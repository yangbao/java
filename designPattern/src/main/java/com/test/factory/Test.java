package com.test.factory;

import com.test.factory.abstractFactroy.AndroidFactory;
import com.test.factory.abstractFactroy.OperationController;
import com.test.factory.abstractFactroy.SystemFactory;
import com.test.factory.abstractFactroy.UIController;
import com.test.factory.facroty.PngFactory;
import com.test.factory.facroty.ReaderFactory;
import com.test.factory.simpleFactory.Shape;
import com.test.factory.simpleFactory.ShapeFactory;

public class Test {

    public static void main(String[] args) {

        //简单工厂, 如果新增加一个椭圆，就需要改动factory的代码
//        Shape shape = ShapeFactory.getShape("circle");
//        shape.draw();
        //普通工厂， 可以任意的扩展产品
//        ReaderFactory readerFactory = new PngFactory();
//        readerFactory.getReader().read();
    //抽象工厂， 生产系列产品
        SystemFactory factory = new AndroidFactory();
        UIController uiController = factory.createInterfaceController();
        uiController.display();

        OperationController operationController = factory.createOperationController();
        operationController.control();


    }
}
