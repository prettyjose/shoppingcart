package org.prettyinc.prettyinvoicing.items;

public abstract
class Item implements Buyable{
    private String name;
    private String unit;
    private Double unitRate;
    private Double stockQuantity;
    private Boolean perishable;
    //ToDO: add expiry date

    Item(String name, String unit, Double unitRate, Double stockQuantity, Boolean perishable){
        this.name = name;
        this.unit = unit;
        this.unitRate = unitRate;
        this.stockQuantity = stockQuantity;
        this.perishable = perishable;
    }

    @Override
    public
    boolean isInStock(Double neededQuantity) {
        return (this.getStockQuantity()-neededQuantity)>0? Boolean.TRUE:Boolean.FALSE;
    }

    public
    String getName() {
        return name;
    }

    public
    Double getUnitRate() {
        return unitRate;
    }

    public
    Double getStockQuantity() {
        return stockQuantity;
    }

    public
    void modifyStockQuantity(Double shoppedQuantity) {
        this.stockQuantity -= shoppedQuantity;
    }


}
