package org.prettyinc.prettyinvoicing;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};
    private int[] rates = {100,80,30,120};
    private Double[] quants = {2.0, 1.5, 0.5, 0.75};
    public static void main(String[] args) {
	    //create interface Buyable
        //create abstract item
        //create fruit class extending item
        //create bill class with list of items, tot amt.
        //use bill obj in main


        Shop shop = new Shop();
        shop.initialise();
        shop.generateBill();


    }
}
