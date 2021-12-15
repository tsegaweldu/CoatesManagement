package com.tsega.School;

import java.util.List;
/**
 * 
 * The school can have many teachers and many students
 * Implements teachers and students as an array list
 * @author Tsega
 *
 */
public class School {
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static  int totalMoneyEarned;
	private static  int  totalMoneySpent;
	
	
	/**
	 * this will construct the new school object
	 * @param teachers.list of teachers in the school
	 * @param students...list of teachers in the school
	 */
	public School(List<Teacher> teachers, List<Student> students)
	{	
		this.teachers=teachers;
		this.students=students;
		totalMoneyEarned=10;
		totalMoneySpent=10;
	}
	
	public void setTeachers(List<Teacher> teachers)
	{
		this.teachers=teachers;
	}
	public void setStudents(List<Student> students)
	  {
		  this.students=students;
	  }
	
	/**
	 * get the list of teachers
	 * @return
	 */
  public List<Teacher> getTeachers() {
	  
	  return this.teachers;
  }
  
  public int getTotalmoneySpend() {
		
	 
		return totalMoneySpent;
	}
  
  public void addTeacher(Teacher teacher) {
	  
	  teachers.add(teacher);
	  
  }
  public void addStudent(Student student)
  {
	  students.add(student);
  }
 
 /**
  * this will update the money spent by deducting the paid salary 
  * @param moneyPaid
  */
 public static void updateTotalMoneySpent(int moneyPaid) {
	 totalMoneySpent+=moneyPaid; 
	 totalMoneyEarned-=totalMoneySpent;
 }
 

public static void updateTotalMoneyEarned(int moneyEarned) {
	
	totalMoneyEarned+=moneyEarned;
}

public void getTeacher(int id) {
	
	for(Teacher t:teachers)
	{
		if (t.getTeacherId()==id)
	
	System.out.println("Teacher Name:" + t.teacherName+"\n"+" Teacher id:"+t.getTeacherId()+"\n"+"Salar"+t.salary);
}
}

public void getStudent(int id) {
	
	for(Student s:students) {
		if(s.getStudentId()==id)
			System.out.println("The student name is :"+s.getName() +"\n"+"The student id is:"+s.getStudentId()+"\n"+"The grade is :"+s.getGrade()+"\n"
					+"Total amount paid"+s.getFeePaid()+"\n"+"yet to be paid:"+s.MoneyNeededToBePaidYet());
	}
}

public int  getTotalMoneyEarned() {
	
	
	return this.totalMoneyEarned;
}

public void findByName(String name) {
	for(Student s:students) {
		
		if(s.getName()==name) {
			
			System.out.println("name : "+s.getName()+"grade: "+ s.getGrade()+"paid fee:"+s.getFeePaid());
		}
	}
	
}


}
