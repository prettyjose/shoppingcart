package org.prettyinc.prettyinvoicing;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.initialise();
        shop.generateBill();
    }
}
