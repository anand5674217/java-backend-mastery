# User Prototype Registry

This module demonstrates the Prototype design pattern with preconfigured `User`
objects stored in a registry and cloned on demand.

## Problem

Creating mock users repeatedly for tests or demos is repetitive when the same
base configurations are used over and over.

## Solution

Store template `User` objects by `UserType` in a registry and clone them when a
new instance is needed.

## Classes

- `ClonableObject` - generic contract for cloning an object
- `User` - prototype object with user details
- `UserType` - supported prototype categories
- `UserPrototypeRegistry` - registry contract for adding, fetching, and cloning
- `UserRegistryImpl` - in-memory registry implementation
