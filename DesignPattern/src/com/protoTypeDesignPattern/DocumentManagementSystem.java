package com.protoTypeDesignPattern;

public class DocumentManagementSystem {
    public static void main(String[] args) {
        // Create initial documents (prototypes)
        Document wordDocPrototype = new WordDocument();
        wordDocPrototype.setContent("Initial Word Content");

        Document pdfDocPrototype = new PDFDocument();
        pdfDocPrototype.setContent("Initial PDF Content");

        // Clone the prototypes to create new documents
        Document newWordDoc = wordDocPrototype.clone();
        newWordDoc.setContent("New Word Content");

        Document newPdfDoc = pdfDocPrototype.clone();
        newPdfDoc.setContent("New PDF Content");

        // Print the contents of the new documents
        newWordDoc.print(); // Outputs: Word Document Content: New Word Content
        newPdfDoc.print();  // Outputs: PDF Document Content: New PDF Content
    }
}
