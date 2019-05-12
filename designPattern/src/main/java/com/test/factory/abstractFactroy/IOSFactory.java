package com.test.factory.abstractFactroy;

public class IOSFactory extends SystemFactory {
    @Override
    public OperationController  createOperationController() {
       return new IosOperationController();
    }

    @Override
    public UIController createInterfaceController() {
        return new  IosUIController();
    }
}
