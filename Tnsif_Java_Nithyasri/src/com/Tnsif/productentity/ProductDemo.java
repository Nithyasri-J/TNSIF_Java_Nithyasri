package com.Tnsif.productentity;

public class ProductDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.setPname("iphone 14");
		p1.setPmemory("128GB");
		p1.setPcost(70000);
		System.out.println("Name:"+p1.getPname()+" Memory:"+p1.getPmemory()+" cost:"+p1.getPcost());
		Product p2=new Product();
		p2.setPname("Laptop");
		p2.setPmemory("512GB");
		p2.setPcost(55000);
		System.out.println("Name:"+p2.getPname()+" Memory:"+p2.getPmemory()+" cost:"+p2.getPcost());
		Product p3=new Product();
		p3.setPname("watch");
		p3.setPmemory("16GB");
		p3.setPcost(30000);
		System.out.println("Name:"+p3.getPname()+" Memory:"+p3.getPmemory()+" cost:"+p3.getPcost());
	}

}
