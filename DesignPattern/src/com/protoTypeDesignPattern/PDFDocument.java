package com.protoTypeDesignPattern;

public class PDFDocument implements Document {
    private String content;

    public PDFDocument() {
        // Simulate a complex initialization process
        System.out.println("Loading PDF document template...");
    }

    @Override
    public Document clone() {
        try {
            return (PDFDocument) super.clone();
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
        System.out.println("PDF Document Content: " + content);
    }
}
