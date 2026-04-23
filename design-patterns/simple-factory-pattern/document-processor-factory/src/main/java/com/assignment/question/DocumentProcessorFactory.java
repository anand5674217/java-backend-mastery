package com.assignment.question;

public final class DocumentProcessorFactory {

    private DocumentProcessorFactory() {
    }

    public static DocumentProcessor createProcessor(String documentName, DocumentType type) {
        if (type == null) {
            return null;
        }

        return switch (type) {
            case TEXT -> new TextDocumentProcessor(documentName);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(documentName);
            case PRESENTATION -> new PresentationDocumentProcessor(documentName);
        };
    }
}
