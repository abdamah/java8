package com.riigsoft.service.impl;

import com.riigsoft.service.Sim;

public class Jio implements Sim {
    @Override
    public void sim3g() {
        System.out.println("JIO supports 3G sim.");
    }

    @Override
    public void sim4g() {
        System.out.println("JIO supports 4G sim.");
    }

    // this is optional for impl.
    @Override
    public void sim5g() {
        System.out.println("JIO supports 5G sim.");
    }
}
