package com.fog.money;

import java.util.ArrayList;

/**
 * Created by chen on 2016/11/19.
 */

public class Money {

    private long price;
    private long count;
    private ArrayList<IFactor> factors;

    public Money(long price, long count){
        this.price = price;
        this.count = count;
        factors = new ArrayList<>();
    }

    protected Money addFactor(IFactor factor){
        factors.add(factor);
        return this;
    }

    public long cost(){
        long originalCost = price * count;
        for(IFactor factor : factors){
            originalCost = factor.cost(originalCost);
        }
        return originalCost;
    }

    public static String fen2yuan(long fen){
        return String.valueOf((double)fen/100);
    }

    public void clear(){
        factors.clear();
    }
}
