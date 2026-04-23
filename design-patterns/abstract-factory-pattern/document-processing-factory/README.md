# Document Processing Factory

This module demonstrates the Abstract Factory pattern by creating compatible
document processors, parsers, and printers for a specific document family.

## Problem

Document processing requires several related objects, and those objects need to
stay compatible within the same document type family.

## Solution

Use a concrete `DocumentFactory` per document type to create the matching
processor, parser, and printer together.

## Classes

- `DocumentFactory` - abstract factory for document families
- `TextDocumentFactory` - factory for the text document family
- `SpreadsheetDocumentFactory` - factory for the spreadsheet family
- `processor.*` - document processor hierarchy
- `parser.*` - document parser hierarchy
- `printer.*` - document printer hierarchy
