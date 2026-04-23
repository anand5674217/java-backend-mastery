package com.assignment.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;

class DocumentProcessorFactoryTest {

    @Test
    void createsTextProcessorForTextType() {
        DocumentProcessor processor = DocumentProcessorFactory.createProcessor("notes.txt", DocumentType.TEXT);

        assertInstanceOf(TextDocumentProcessor.class, processor);
        assertEquals("notes.txt", processor.getDocumentName());
        assertEquals(DocumentType.TEXT, processor.supportsType());
    }

    @Test
    void createsSpreadsheetProcessorForSpreadsheetType() {
        DocumentProcessor processor = DocumentProcessorFactory.createProcessor("budget.xlsx", DocumentType.SPREAD_SHEET);

        assertInstanceOf(SpreadsheetDocumentProcessor.class, processor);
        assertEquals(DocumentType.SPREAD_SHEET, processor.supportsType());
    }

    @Test
    void createsPresentationProcessorForPresentationType() {
        DocumentProcessor processor = DocumentProcessorFactory.createProcessor("deck.pptx", DocumentType.PRESENTATION);

        assertInstanceOf(PresentationDocumentProcessor.class, processor);
        assertEquals(DocumentType.PRESENTATION, processor.supportsType());
    }

    @Test
    void returnsNullForNullType() {
        assertNull(DocumentProcessorFactory.createProcessor("unknown", null));
    }
}
