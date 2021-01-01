module Launcher.starter {

    requires Launcher.core;
    requires javafx.controls;
    requires transitive Launcher.ui;

    opens com.github.lkapitman.starter to javafx.graphics;
}
