# Document Processor Factory

This module demonstrates the Simple Factory pattern for creating document
processors from a `DocumentType`.

## Problem

Client code should not need to know which processor class to instantiate for
each document type.

## Solution

Use a central `DocumentProcessorFactory` that maps `DocumentType` values to the
correct `DocumentProcessor` implementation.

## Classes

- `DocumentProcessor` - common parent abstraction
- `TextDocumentProcessor` - processor for text documents
- `SpreadsheetDocumentProcessor` - processor for spreadsheets
- `PresentationDocumentProcessor` - processor for presentations
- `DocumentProcessorFactory` - simple factory for processor creation
