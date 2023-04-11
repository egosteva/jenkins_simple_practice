package com.github.egosteva.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class SystemPropertiesTests {

    @Test
    void webPropertyTest() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
    }

    @Test
    void webProperty1Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser");
        System.out.println(browserName);
    }

    @Test
    void webProperty2Test() {
        String browserName = System.getProperty("browser", "mozilla");
        System.out.println(browserName);
    }

    @Test
    void webProperty3Test() {
        System.setProperty("browser", "opera");
        String browserName = System.getProperty("browser", "mozilla");
        System.out.println(browserName);
    }

    @Test
    @Tag("one_property")
    void webProperty4Test() {
        String browserName = System.getProperty("browser", "mozilla");
        System.out.println(browserName);
    }

    @Test
    @Tag("many_properties")
    void webProperty5Test() {
        String browserName = System.getProperty("browser", "mozilla");
        String browserVersion = System.getProperty("browser_version", "99.0");
        System.out.println(browserName);
        System.out.println(browserVersion);
    }

    @Test
    @Tag("hello")
    void webProperty6Test() {
        System.out.println(format("Hello, %s!", System.getProperty("user_name","unknown student")));
    }
}
