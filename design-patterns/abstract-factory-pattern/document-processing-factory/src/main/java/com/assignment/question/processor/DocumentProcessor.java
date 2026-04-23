package com.assignment.question.processor;

import com.assignment.question.DocumentType;

public abstract class DocumentProcessor {

    private final String documentName;

    protected DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();
}
