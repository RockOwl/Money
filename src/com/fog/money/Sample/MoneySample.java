package com.fog.money.Sample;

import com.fog.money.Money;

/**
 * Created by chen on 2016/11/19.
 */

public class MoneySample {

    public static void main(String[] args) {
        MyMoney money = new MyMoney(120, 7);        //单价分，数量

        long price = money.discount(0.95f).coupon(300).cost();
        System.out.println(Money.fen2yuan(price));
    }


}
