package org.prettyinc.prettyinvoicing.items;

public
interface Buyable {
    public boolean isInStock(Double neededQuantity);
}
