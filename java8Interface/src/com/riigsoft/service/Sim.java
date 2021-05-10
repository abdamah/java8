package com.riigsoft.service;

public interface Sim {
    void sim3g();

    void sim4g();

    default void sim5g() {
        System.out.println("5G is ready... now you can implement.");
    }

    static void simPolicy() {
        System.out.println("--------------------------------");
        System.out.println("SimProvider : Sim Policy should be followed.");
        System.out.println("--------------------------------");
    }
}
