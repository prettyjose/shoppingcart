package org.prettyinc.prettyinvoicing;

import java.util.ArrayList;
import java.util.List;

public
class Bill {

    //private static int billNum;
    List<BillItem> billItems;
    Double billAmount;
    Bill() {
        billItems = new ArrayList<BillItem>();
        billAmount = 0.0;
    }

    public void addBillItem(BillItem billItem) {
        billItems.add(billItem);
        addToBillAmount(billItem);
    }

    private void addToBillAmount(BillItem billItem) {
        billAmount += (billItem.getQuantity() * billItem.getItem().getUnitRate());
    }

    public void printInvoice(){
        System.out.println("Fruit    Quantity   Amount");
        for(BillItem billItem: billItems){
            Item item = billItem.getItem();
            System.out.println(item.getName()+"    "+billItem.getQuantity()+"       "+billItem.getQuantity() * item.getUnitRate());
        }
        System.out.println("Total="+billAmount);
    }
}
