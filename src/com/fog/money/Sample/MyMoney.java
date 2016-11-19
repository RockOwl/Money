package com.fog.money.Sample;

import com.fog.money.IFactor;
import com.fog.money.Money;

/**
 * Created by chen on 2016/11/19.
 */

public class MyMoney extends Money {

    public MyMoney(long price, long count){
        super(price, count);
    }

    /**
     * 折扣
     * @param value
     * @return
     */
    public MyMoney discount(final float value){
        addFactor((long originalCost) -> (long)Math.floor(originalCost * value));
        return this;
    }

    /**
     * 抵扣券
     * @param deduct
     * @return
     */
    public MyMoney coupon(final long deduct){
        addFactor((long originalCost) -> originalCost - Math.min(originalCost, deduct));
        return this;
    }




}
