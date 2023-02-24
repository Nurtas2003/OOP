package Problem4;

import Practise3.Student;

public class TestGradeBook {

	public static void main(String[] args) {
		Course courses = new Course("OOP", 5, new Time(12,30), "CS101");
		Student s1 = new Student("Nurtas ", 1, 98);
		Student s2 = new Student("Aibergen ", 2, 99);
		Student s3 = new Student("Nargiza ", 3, 72);
		Student s4 = new Student("Madi ", 4, 86);
		Student s5 = new Student("Adema ", 5, 96);
		Student s6 = new Student("Student A ", 6, 34);
		Student s7 = new Student("Leila", 7, 100);
		Student s8 = new Student("Aruzhan ", 8, 94);
		
		GradeBook gb = new GradeBook(courses);
		gb.displayMessage();
		gb.push(s1);
		gb.push(s2);
		gb.push(s3);
		gb.push(s4);
		gb.push(s5);
		gb.push(s6);
		gb.push(s7);
		gb.push(s8);
		gb.outputBarChart();
		gb.displayGradeReport();
		System.out.println("Grades distribution:");
		gb.outputDistribution();
	}

}
