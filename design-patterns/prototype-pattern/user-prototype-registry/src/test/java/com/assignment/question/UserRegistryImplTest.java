package com.assignment.question;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

class UserRegistryImplTest {

    @Test
    void cloneReturnsDistinctUserWithSameValues() {
        UserPrototypeRegistry registry = new UserRegistryImpl();
        User prototype = new User(1L, "admin", "admin@example.com", "Admin", 30, UserType.ADMIN);

        registry.addPrototype(prototype);
        User clone = registry.clone(UserType.ADMIN);

        assertNotNull(clone);
        assertNotSame(prototype, clone);
        assertEquals(prototype.getUserId(), clone.getUserId());
        assertEquals(prototype.getUsername(), clone.getUsername());
        assertEquals(prototype.getEmail(), clone.getEmail());
        assertEquals(prototype.getDisplayName(), clone.getDisplayName());
        assertEquals(prototype.getAge(), clone.getAge());
        assertEquals(prototype.getType(), clone.getType());
    }

    @Test
    void getPrototypeReturnsStoredInstance() {
        UserPrototypeRegistry registry = new UserRegistryImpl();
        User prototype = new User(2L, "writer", "writer@example.com", "Writer", 27, UserType.WRITER);

        registry.addPrototype(prototype);

        assertSame(prototype, registry.getPrototype(UserType.WRITER));
    }

    @Test
    void cloneReturnsNullWhenPrototypeDoesNotExist() {
        UserPrototypeRegistry registry = new UserRegistryImpl();

        assertNull(registry.clone(UserType.READER));
    }
}
