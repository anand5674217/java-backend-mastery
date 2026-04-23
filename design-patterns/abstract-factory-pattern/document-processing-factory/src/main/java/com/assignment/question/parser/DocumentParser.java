package com.assignment.question.parser;

import com.assignment.question.DocumentType;

public abstract class DocumentParser {

    private final String path;

    protected DocumentParser(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public abstract void parseDocument();

    public abstract DocumentType supportsType();
}
