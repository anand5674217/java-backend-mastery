package com.assignment.question.processor;

import com.assignment.question.DocumentType;

public class TextDocumentProcessor extends DocumentProcessor {

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a text document: " + getDocumentName());
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
