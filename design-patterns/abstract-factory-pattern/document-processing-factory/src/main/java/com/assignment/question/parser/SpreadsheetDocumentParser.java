package com.assignment.question.parser;

import com.assignment.question.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    @Override
    public void parseDocument() {
        // Parse spreadsheet document content.
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}
