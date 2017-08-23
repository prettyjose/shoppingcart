package org.prettyinc.prettyinvoicing;

public class BillItem {
    Item shoppedItem;
    Double quantity;
    BillItem(Item item, Double quant){
        shoppedItem = item;
        quantity = quant;
    }
    public Item getItem(){
        return shoppedItem;
    }
    public Double getQuantity(){
        return quantity;
    }

}
