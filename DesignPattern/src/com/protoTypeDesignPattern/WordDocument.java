package com.protoTypeDesignPattern;

public class WordDocument implements Document {
    private String content;

    public WordDocument() {
        // Simulate a complex initialization process
        System.out.println("Loading Word document template...");
    }

    @Override
    public Document clone() {
        try {
            return (WordDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // Handle exception appropriately in real use
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void print() {
        System.out.println("Word Document Content: " + content);
    }
}

