package com.assignment.question;

public abstract class DocumentProcessor {

    private final String documentName;

    protected DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract DocumentType supportsType();

    public abstract void processDocument();
}
