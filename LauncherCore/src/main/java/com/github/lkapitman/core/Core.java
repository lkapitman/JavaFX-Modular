package com.github.lkapitman.core;

import java.util.Optional;
import java.util.ServiceLoader;

public interface Core {
    String getGreeting(String name);

    static Optional<Core> getInstance() {
        return ServiceLoader.load(Core.class).findFirst();
    }
}
