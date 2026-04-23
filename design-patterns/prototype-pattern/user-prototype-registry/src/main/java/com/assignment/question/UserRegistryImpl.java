package com.assignment.question;

import java.util.HashMap;
import java.util.Map;

public class UserRegistryImpl implements UserPrototypeRegistry {

    private final Map<UserType, User> userRegistry = new HashMap<>();

    @Override
    public void addPrototype(User user) {
        userRegistry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return userRegistry.get(type);
    }

    @Override
    public User clone(UserType type) {
        User prototype = userRegistry.get(type);
        return prototype == null ? null : prototype.cloneObject();
    }
}
