package com.jumpmind.proto.metl;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "Base for Metl", shortName = "Metl Base")
public class AppShell implements AppShellConfigurator {
}
