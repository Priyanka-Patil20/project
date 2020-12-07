package com.vwits.demo;

import com.vwits.dao.DaoImplementation;
import com.vwits.model.Faculty;
import com.vwits.model.Student;
import com.vwits.model.Test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s=new Student(2,"Nitu","Nitu","Nitu@gmailcom",12345678);
		//Faculty f=new Faculty(1,"Priya","Priya","priya@gmail.com",12345678);
		DaoImplementation d= new DaoImplementation();
		//d.saveStudent(s);
		//d.saveFaculty(f);
		System.out.println(d.getAllStudent());
		System.out.println(d.getAllFaculty());
		
		//Test t=new Test(1,"What is your Name","abc","pqr","xyz","lmn","abc",2);
		//d.saveTest(t);
		
		System.out.println(d.getAllTest());
		//System.out.println("Result is"+d.result(t));
		System.out.println();
	}

}
