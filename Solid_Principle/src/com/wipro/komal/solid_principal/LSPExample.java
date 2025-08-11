package com.wipro.komal.solid_principal;

interface Discount{
	void apply(double amount);
}

class StudentDiscount implements Discount{
	public void apply(double amount) {
		double Discountamount = amount * 0.75;
		System.out.println("Discounted Amount is"+ " "+Discountamount);
		}
}

class RegularDiscount implements Discount{
	public void apply(double amount) {
	double Discountamount=  amount * 0.5;
	System.out.println("Discounted Amount is"+" "+ Discountamount);

	}
}

public class LSPExample{
	public static void main(String[] args) {
		double bill = 1205.25;
		
		StudentDiscount ds = new StudentDiscount();
		ds.apply(bill);
		RegularDiscount dr = new RegularDiscount();
		dr.apply(bill);
	}
}