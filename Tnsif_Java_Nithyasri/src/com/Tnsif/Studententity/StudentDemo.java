package com.Tnsif.Studententity;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.setSreg(100);
		s1.setSname("Nithu");
		s1.setSScore(83);
		System.out.println("Student Register no:"+s1.getSreg()+" Student Name:"+s1.getSname()+" Student Score:"+s1.getSScore());
		Student s2=new Student();
		s2.setSreg(101);
		s2.setSname("sri");
		s2.setSScore(79);
		System.out.println("Student Register no:"+s2.getSreg()+" Student Name:"+s2.getSname()+" Student Score:"+s2.getSScore());
		Student s3=new Student();
		s3.setSreg(102);
		s3.setSname("Nithyasri");
		s3.setSScore(98);
		System.out.println("Student Register no:"+s3.getSreg()+" Student Name:"+s3.getSname()+" Student Score:"+s3.getSScore());


		
	}

}
