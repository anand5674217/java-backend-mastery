package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.parser.SpreadsheetDocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.printer.SpreadsheetDocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentParser createDocumentParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createDocumentPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }

    @Override
    public DocumentProcessor createDocumentProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }
}
