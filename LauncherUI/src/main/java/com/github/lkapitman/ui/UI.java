package com.github.lkapitman.ui;

import com.github.lkapitman.core.Core;

public class UI implements Core {

    @Override
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }
}
