package com.assignment.question.parser;

import com.assignment.question.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    @Override
    public void parseDocument() {
        // Parse text document content.
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}
