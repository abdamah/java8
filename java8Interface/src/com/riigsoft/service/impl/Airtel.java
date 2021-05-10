package com.riigsoft.service.impl;

import com.riigsoft.service.Sim;

public class Airtel implements Sim {

    @Override
    public void sim3g() {
        System.out.println("AIRTEL support 3G sim.");
    }

    @Override
    public void sim4g() {
        System.out.println("AIRTEL supports 4G sim.");
    }
    //sim5g method is optional so that airtel is doesn't
    //support 5G sim. In the future may be.

}
