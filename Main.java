package com.tsega.School;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Student sara= new Student(101,"sara","5rd");
		Student kara= new Student(102,"kara","2rd");
		Student mara= new Student(103,"mara","5rd");
		Student dada= new Student(103,"dada","5rd");
		
		Teacher teacher1=new Teacher(001,"tedrose",2000);
		Teacher teacher2=new Teacher(002,"moges",5000);
		Teacher teacher3=new Teacher(003,"kebede",6000);
		
		List<Student> students= new ArrayList<>();
		List<Teacher> teachers= new ArrayList<>();
		students.add(sara);
		students.add(kara);
		students.add(mara);
		students.add(dada);
		
		teachers.add(teacher1);
		teachers.add(teacher2);
		teachers.add(teacher3);
		
		
		School coates= new School(teachers,students);
		
		System.out.println("The Total money Earned initially:  "+coates.getTotalMoneyEarned());
		System.out.println("The Total money Spent initially:  "+coates.getTotalmoneySpend());
		System.out.println("sara has paid so far  :"+sara.getFeePaid());
		sara.setFeePaid(2000);
					
		System.out.println("now sara paid :"+sara.getFeePaid());
		System.out.println("The Total money Earned:  "+coates.getTotalMoneyEarned());
		kara.setFeePaid(5000);
		System.out.println("The Total money Earned:  "+coates.getTotalMoneyEarned());
		
		teacher1.receiveSalary(2000);
		System.out.println("Coates total money spend now  "+coates.getTotalmoneySpend());
		
		coates.getStudent(101);
		System.out.println(sara);
		
		coates.findByName("sara");
	}
	
	

}
