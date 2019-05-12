package com.test.factory.abstractFactroy;

public abstract class SystemFactory {

    public abstract OperationController  createOperationController();

    public abstract UIController  createInterfaceController();
}
