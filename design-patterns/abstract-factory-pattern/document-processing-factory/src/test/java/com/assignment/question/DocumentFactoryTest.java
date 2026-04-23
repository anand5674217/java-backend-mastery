package com.assignment.question;

import com.assignment.question.parser.DocumentParser;
import com.assignment.question.parser.SpreadsheetDocumentParser;
import com.assignment.question.parser.TextDocumentParser;
import com.assignment.question.printer.DocumentPrinter;
import com.assignment.question.printer.SpreadsheetDocumentPrinter;
import com.assignment.question.printer.TextDocumentPrinter;
import com.assignment.question.processor.DocumentProcessor;
import com.assignment.question.processor.SpreadsheetDocumentProcessor;
import com.assignment.question.processor.TextDocumentProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class DocumentFactoryTest {

    @Test
    void textFactoryCreatesCompatibleFamily() {
        DocumentFactory factory = new TextDocumentFactory();

        DocumentProcessor processor = factory.createDocumentProcessor("notes.txt");
        DocumentParser parser = factory.createDocumentParser("/docs/notes.txt");
        DocumentPrinter printer = factory.createDocumentPrinter(processor);

        assertEquals(DocumentType.TEXT, factory.supportsType());
        assertInstanceOf(TextDocumentProcessor.class, processor);
        assertInstanceOf(TextDocumentParser.class, parser);
        assertInstanceOf(TextDocumentPrinter.class, printer);
        assertEquals(DocumentType.TEXT, processor.supportsType());
        assertEquals(DocumentType.TEXT, parser.supportsType());
        assertEquals(DocumentType.TEXT, printer.supportsType());
    }

    @Test
    void spreadsheetFactoryCreatesCompatibleFamily() {
        DocumentFactory factory = new SpreadsheetDocumentFactory();

        DocumentProcessor processor = factory.createDocumentProcessor("budget.xlsx");
        DocumentParser parser = factory.createDocumentParser("/docs/budget.xlsx");
        DocumentPrinter printer = factory.createDocumentPrinter(processor);

        assertEquals(DocumentType.SPREAD_SHEET, factory.supportsType());
        assertInstanceOf(SpreadsheetDocumentProcessor.class, processor);
        assertInstanceOf(SpreadsheetDocumentParser.class, parser);
        assertInstanceOf(SpreadsheetDocumentPrinter.class, printer);
        assertEquals(DocumentType.SPREAD_SHEET, processor.supportsType());
        assertEquals(DocumentType.SPREAD_SHEET, parser.supportsType());
        assertEquals(DocumentType.SPREAD_SHEET, printer.supportsType());
    }
}
