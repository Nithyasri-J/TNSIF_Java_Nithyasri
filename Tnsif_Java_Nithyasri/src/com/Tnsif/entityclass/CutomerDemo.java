package com.Tnsif.entityclass;

public class CutomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer();
		c1.setId(101);
		c1.setCname("Nithu");
		c1.setCity("Villupuram");
		System.out.println("Id:"+c1.getId()+"Name:"+c1.getCname()+"City:"+c1.getCity());
		Customer c2=new Customer();
		c2.setId(101);
		c2.setCname("sri");
		c2.setCity("Pondicherry");
		System.out.println("Id:"+c2.getId()+"Name:"+c2.getCname()+"City:"+c2.getCity());
	}

}
