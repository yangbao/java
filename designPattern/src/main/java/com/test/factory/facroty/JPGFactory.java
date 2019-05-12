package com.test.factory.facroty;

public class JPGFactory implements ReaderFactory{
    @Override
    public ReaderAble getReader() {
        return new JpgReader();
    }
}
