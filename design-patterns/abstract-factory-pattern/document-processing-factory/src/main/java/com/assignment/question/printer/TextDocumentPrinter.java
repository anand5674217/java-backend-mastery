package com.assignment.question.printer;

import com.assignment.question.DocumentType;
import com.assignment.question.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    @Override
    public void printDocument() {
        // Print text document output.
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
