package com.protoTypeDesignPattern;

public interface Document extends Cloneable {
    Document clone();
    void setContent(String content);
    String getContent();
    void print();
}

