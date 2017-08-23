package org.prettyinc.prettyinvoicing;

public
class Item {
    String name;
    String unit;
    Double unitRate;
    Item(String name, String unit, Double unitRate){
        this.name = name;
        this.unit = unit;
        this.unitRate = unitRate;
    }

    public
    String getName() {
        return name;
    }

    public
    String getUnit() {
        return unit;
    }

    public
    Double getUnitRate() {
        return unitRate;
    }
}
