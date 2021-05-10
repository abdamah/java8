package com.riigsoft;

import com.riigsoft.service.Sim;
import com.riigsoft.service.impl.Airtel;
import com.riigsoft.service.impl.Jio;


public class Main {
    public static void main(String[] args) {
        //static method calling
        Sim.simPolicy();

        //creating Jio object
        Jio jio = new Jio();

        //calling methods
        jio.sim3g();
        jio.sim4g();
        jio.sim5g();

        System.out.println("--------------------------------");
        //creating Airtel object
        Airtel airtel = new Airtel();

        //calling methods
        airtel.sim3g();
        airtel.sim4g();
        //this is dummy text we provided inside interface.
        airtel.sim5g();
    }
}
