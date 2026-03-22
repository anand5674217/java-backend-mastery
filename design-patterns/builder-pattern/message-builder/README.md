# Message Builder
# Builder Pattern - Message Builder

This module demonstrates the Builder Design Pattern in Java using a simple messaging service example.

## Problem
Creating `Message` objects using constructors with multiple parameters becomes hard to read and maintain.

## Solution
Implemented a `MessageBuilder` to construct `Message` objects step by step.

## Classes
- `Message` - immutable-style message object
- `MessageType` - enum for message type
- `MessageBuilder` - builder class for creating `Message`
- `WithBuilder` - marker annotation

## Example Usage

```java
Message message = new MessageBuilder()
        .messageType(MessageType.TEXT)
        .content("Hello")
        .sender("Anand")
        .recipient("Rahul")
        .isDelivered(true)
        .timestamp(System.currentTimeMillis())
        .build();