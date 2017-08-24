package org.prettyinc.prettyinvoicing.billing;

import org.prettyinc.prettyinvoicing.items.Item;

public class BillItem{
    Item shoppedItem;
    Double quantity;
    public BillItem(Item item, Double quant){
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
