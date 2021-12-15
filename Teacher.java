package com.tsega.School;
/**
 * 
 * @author Tsega weldu
 *This class if responsibe for keeping the track of teacher name, teacher id
 *and teacher salary 
 */
public class Teacher {
	
	int teacherId;
	String teacherName;
	int salary;
	/**
	 * This creates a new teacher object
	 * @param name..name for the teacher
	 * @param teacherId..id for the teacher
	 * @param salary...salary of the teacher
	 */
	public Teacher(int teacherId,String name,int salary) {
		
		this.teacherId=teacherId;
		this.teacherName=name;
		this.salary=salary;
	}
	
	//return the teacher id
	public int getTeacherId() {
		return teacherId;
	}
	
	//return the teacher  name
	public String getTeacherName() {
		return teacherName;
	}
   //return the salary
	public int getSalary() {
		return salary;
	}
	//This set a new salary for the teacher
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to salary of the teachers and remove from tota money of the school
	 * @param salary
	 */
	public void receiveSalary(int salary)
	{
		salary+=salary;
		School.updateTotalMoneySpent(salary);
		
	}
	
	
}
