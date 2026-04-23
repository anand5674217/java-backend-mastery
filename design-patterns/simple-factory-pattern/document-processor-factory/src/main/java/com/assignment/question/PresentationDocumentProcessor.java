package com.assignment.question;

public class PresentationDocumentProcessor extends DocumentProcessor {

    public PresentationDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a presentation document: " + getDocumentName());
    }

    public void addSlide() {
        System.out.println("Adding a slide to the presentation.");
    }
}
