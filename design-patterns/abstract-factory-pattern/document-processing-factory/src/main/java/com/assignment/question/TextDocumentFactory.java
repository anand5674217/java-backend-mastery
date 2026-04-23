package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.parser.TextDocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.printer.TextDocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory {

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }
}
