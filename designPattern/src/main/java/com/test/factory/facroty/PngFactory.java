package com.test.factory.facroty;

public class PngFactory implements ReaderFactory{
    @Override
    public ReaderAble getReader() {
        return new PngReader();
    }
}
