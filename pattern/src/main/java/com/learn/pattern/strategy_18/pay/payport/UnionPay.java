package com.learn.pattern.strategy_18.pay.payport;

public class UnionPay extends Payment {

	public String getName() {
		return "银联支付";
	}

	protected double queryBalance(String uid) {
		return 120;
	}

}
