package org.prettyinc.prettyinvoicing;

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
        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};
        Double[] rates = {100.0,80.0,30.0,120.0};
        for(int i=0; i<fruits.length;i++){
            Item item = new Item(fruits[i], "kg", rates[i]);
            items.put(fruits[i], item);
        }
    }

    public Item getItem(String name){
        return items.get(name);
    }
    public void generateBill(){
        Bill newBill = new Bill();
        BillItem billItem;
        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi"};
        Double[] quants = {2.0, 1.5, 0.5, 0.75};
        for(int i=0; i<fruits.length;i++){
            Item item = items.get(fruits[i]);
            billItem = new BillItem(item, quants[i]);
            newBill.addBillItem(billItem);
        }
        newBill.printInvoice();
    }
    //To-Do: print bill with number
    /*public void printBill(){

    }*/

}
