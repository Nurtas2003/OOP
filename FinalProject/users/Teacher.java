package users;

import java.io.Serializable;
import java.util.Objects;


import course.Course;
import course.CourseFile;
import mark.AttestationType;
import mark.Mark;
import other.Time;

public class Teacher extends Employee implements Serializable, Comparable<Object>{
	
	private static final long serialVersionUID = 1L;
	
	private DegreeTeacher degree;
	private FacultyType department;
	private double rating;
	private int ratedCnt;
	private Time officeHour;
	
	public Teacher() {
		
	}
	public Teacher(String fullName, String username, String password, int salary, DegreeTeacher degree, FacultyType department) {
		super(fullName, username, password, salary);
		this.degree = degree;
		this.department = department;		
		this.rating = 0;
		this.ratedCnt = 0;
	}

	
	public boolean putMark(Course course, Student student, double point, AttestationType period) {
		if (student.getMarks().containsKey(course)) {
			Mark mark = new Mark(point, period);
			if (mark.getPeriod() == AttestationType.FIRST) {
				mark.setMark(student.getMarks().get(course).getFirstAttestation());
				student.getMarks().put(course, mark);
			}
			else if (mark.getPeriod() == AttestationType.SECOND){
				student.getMarks().get(course).setSecondAttestation(student.getMarks().get(course).getSecondAttestation() + point);
				student.getMarks().put(course, student.getMarks().get(course));
			}
			else {
				student.getMarks().get(course).setExamMark(student.getMarks().get(course).getExamMark() + point);
				student.getMarks().put(course, student.getMarks().get(course));
			}
			Database.marks.add(mark);
			return true;
		}
		return false;
	}
	
	public String viewCourses() {
		String courses = "";
		for (Course c : Database.courses) {
			if (c.getTeachers().contains(this)) courses += c.getCourseName() + " ";
		}
		return courses;
	}
	
	public String viewStudents() {
		String st = "";
		for (Student s : Database.students) {
			for (Course c : Database.courses) {
				if (c.getTeachers().contains(this) && s.viewCourse().contains(c)) {
					st += s.toString();
				}
			}
		}
		return st;
	}
	
	public boolean addCourseFile(CourseFile file) {
		if (Database.files.contains(file)) return false;
		Database.files.add(file);
		return true;
	}
	
	public boolean removeCourseFile(CourseFile file) {
		if (Database.files.contains(file)) {
			Database.files.remove(file);
			return true;
		}
		return false;
	}
	
	public DegreeTeacher getDegree() {
		return degree;
	}
	public void setDegree(DegreeTeacher degree) {
		this.degree = degree;
	}
	public FacultyType getDepartment() {
		return department;
	}
	public void setDepartment(FacultyType department) {
		this.department = department;
	}
	public double getRating() {
		try{
			return rating / ratedCnt;
    	}
    	catch(ArithmeticException a){
    		System.out.println("Not rated");
    		a.printStackTrace();
    	}
		return rating / ratedCnt;
	}
	public void setRating(double rating) {
		this.ratedCnt += 1;
		this.rating = getRating() + rating;
	}
	public Time getOfficeHour() {
		return officeHour;
	}
	public void setOfficeHour(Time officeHour) {
		this.officeHour = officeHour;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Teacher [degree=" + degree + ", department=" + department + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(degree, department, officeHour, rating);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return degree == other.degree && department == other.department && Objects.equals(officeHour, other.officeHour)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating);
	}
	
	@Override
	public int compareTo(Object o) {
		if (super.compareTo(o) == 0) {
			Teacher t = (Teacher)o;
			if (getRating() < t.getRating()) return -1;
			else return 1;
		}
		return 0;
	}
	
	
	
}
