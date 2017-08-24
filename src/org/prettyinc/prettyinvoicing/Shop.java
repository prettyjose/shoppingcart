package org.prettyinc.prettyinvoicing;

import org.prettyinc.prettyinvoicing.billing.Bill;
import org.prettyinc.prettyinvoicing.billing.BillItem;
import org.prettyinc.prettyinvoicing.items.Fruit;
import org.prettyinc.prettyinvoicing.items.InvoicingConstants;
import org.prettyinc.prettyinvoicing.items.Item;

import java.util.HashMap;
import java.util.Map;

public
class Shop {
    Map<String, Item> items;
    public Shop(){
        items = new HashMap<String, Item>();
    }
    public void initialise(){
        //add items.
        for(int i=0; i<InvoicingConstants.fruits.length;i++){
            Item item = new Fruit(InvoicingConstants.fruits[i], "kg", InvoicingConstants.rates[i], InvoicingConstants.stock[i]);
            items.put(InvoicingConstants.fruits[i], item);
        }
    }

    public Item getItem(String name){
        return items.get(name);
    }

    public void generateBill(){
        Bill newBill = new Bill();
        BillItem billItem;
        for(int i=0; i<InvoicingConstants.fruits.length;i++){
            Item item = getItem(InvoicingConstants.fruits[i]);
            if(item.isInStock(InvoicingConstants.quants[i])) {
                billItem = new BillItem(item, InvoicingConstants.quants[i]);
                newBill.addBillItem(billItem);
                item.modifyStockQuantity(InvoicingConstants.quants[i]);
            }
        }
        newBill.printInvoice();
    }
    //ToDO: print bill with number
    /*public void printBill(){

    }*/

}
