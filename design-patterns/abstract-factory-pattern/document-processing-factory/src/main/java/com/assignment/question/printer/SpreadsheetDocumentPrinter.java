package com.assignment.question.printer;

import com.assignment.question.DocumentType;
import com.assignment.question.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    @Override
    public void printDocument() {
        // Print spreadsheet document output.
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
