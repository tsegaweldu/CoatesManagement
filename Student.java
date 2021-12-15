package com.tsega.School;

import java.util.List;
/*
 * created by Tsega weldu
 * This class is responsible for keeping the track of  students 
 * name ,id,and fee paid and total fee 
 * */
public class Student {
	private   int studentId;
	private   String name;
	private   int totalFee;
	private   int feePaid;
	private String grade;
	/**
	 * To create a new student by initializing with those values
	 * Fees for every student is $30,000.
	 * Fees paid initially is 0.
	 * @param studentId id for student :unique
	 * @param name student name
	 * @param grade grade of a student
	 */
	
	public Student(int studentId,String name,String grade) {
		this.totalFee=30000;
		this.feePaid=0;
		this.studentId=studentId;
		this.name=name;
		this.grade=grade;
		
	}
	/*I am not going to alter students name, student id and fees total,
	 * so there is no need to create a setter method for those fields.
	 * */
	//this will get the student name
	public String getName() {
		return name;
	}

	//this will get the Total fee
  public int getTotalFee() {
		return totalFee;
	}

	
//this will get the total fees paid by the student
	public int getFeePaid() {
		return feePaid;
	}
/**
 * keep adding the new fees paid to feepaid field
 * The school is going to receive the fund
 * @param fee
 */
	public void setFeePaid(int fee) {
		this.feePaid+=fee;
		School.updateTotalMoneyEarned(feePaid);
	}
//return the student id
	public int getStudentId() {
		return this.studentId;
	}
	/**
	 * 
	 * @param grade use to update students grade
	 */
	public void setGrade(String grade) {
		this.grade=grade;
	}
	//this will return the students grade
	public String getGrade() {
		
		return grade;
	}
	
	public int MoneyNeededToBePaidYet() {
		
		int moneyNeededTobepaidYet=getTotalFee()-getFeePaid();
		return moneyNeededTobepaidYet;
	}
	public String toString() {
		
		return "student's name: "+name+" The id number us : "+studentId;
	}
	
	
}
