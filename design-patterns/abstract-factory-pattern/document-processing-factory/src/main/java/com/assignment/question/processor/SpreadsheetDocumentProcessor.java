package com.assignment.question.processor;

import com.assignment.question.DocumentType;

public class SpreadsheetDocumentProcessor extends DocumentProcessor {

    public SpreadsheetDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a spreadsheet document: " + getDocumentName());
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
