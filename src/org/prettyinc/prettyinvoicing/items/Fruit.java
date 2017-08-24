package org.prettyinc.prettyinvoicing.items;

public
class Fruit extends Item {

    public Fruit(String name, String unit, Double unitRate, Double stockQuantity) {

        super(name, unit, unitRate, stockQuantity, Boolean.TRUE);
    }

}
