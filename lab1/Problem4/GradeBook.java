package Problem4;
import java.util.Vector;
import Practise3.Student;
public class GradeBook {
	public Vector<Student> Students;
	Course course;
	
	GradeBook(Course course){
		this.course=course;
	}
	{
		Students = new Vector<Student>();
	}
	
	public void push(Student s) {
		Students.add(s);
	}
	
	public void displayMessage() {
		System.out.println(course);
	}
	
	public void displayGradeReport() {
		System.out.println("Class average is " + determineClassAverage() + ". Lowest grade is "+ Minimum() + " ("+MinimumName() + ", ID:" + MinimumID() + ")" + ". Highest grade is " + Maximum()+" ("+MaximumName()+", ID:" + MaximumID() + ")"+"." );
	}
	
	public double determineClassAverage() {
		int sum=0;
		for(Student people:Students) {
			sum+=people.getPoint();
		}
		return sum/Students.size();
	}
	
	public int Maximum() {
		int max = Integer.MIN_VALUE;
		for(Student people:Students) {
			if(people.getPoint()>max) {
				max=people.getPoint();
			}
		}
		return max;
	}
	public String MaximumName() {
		int max = Integer.MIN_VALUE;
		String maxName="";
		for(Student people:Students) {
			if(people.getPoint()>max) {
				max=people.getPoint();
				maxName=people.name;
			}
		}
		return maxName;
	}
	
	public int MaximumID() {
		int max = Integer.MIN_VALUE;
		int maxID=0;
		for(Student people:Students) {
			if(people.getPoint()>max) {
				max=people.getPoint();
				maxID=people.getID();
			}
		}
		return maxID;
	}
	public int Minimum() {
		int min = Integer.MAX_VALUE;
		for(Student people:Students) {
			if(people.getPoint()<min) {
				min=people.getPoint();
			}
		}
		return min;
	}
	public String MinimumName() {
		int min = Integer.MAX_VALUE;
		String minName="";
		for(Student people:Students) {
			if(people.getPoint()<min) {
				min=people.getPoint();
				minName=people.name;
			}
		}
		return minName;
	}
	
	public int MinimumID() {
		int min = Integer.MAX_VALUE;
		int minID=0;
		for(Student people:Students) {
			if(people.getPoint()<min) {
				min=people.getPoint();
				minID=people.getID();
			}
		}
		return minID;
	}
		

	
	public void outputBarChart() {
		for(Student cur: Students) {
			System.out.println(cur);
		}
	}
	public void outputDistribution() {
		String s1="";
		String s2="";
		String s3="";
		String s4="";
		String s5="";
		String s6="";
		String s7="";
		String s8="";
		String s9="";
		String s10="";
		String s="";
		for(Student cur: Students) {
			if(cur.getPoint()>=0 && cur.getPoint()<=9) {
				s+='*';
			}
			if(cur.getPoint()>=10 && cur.getPoint()<=19) {
				s1+='*';
			}
			if(cur.getPoint()>=20 && cur.getPoint()<=29) {
				s2+='*';
			}
			if(cur.getPoint()>=30 && cur.getPoint()<=39) {
				s3+='*';
			}
			if(cur.getPoint()>=40 && cur.getPoint()<=49) {
				s4+='*';
			}
			if(cur.getPoint()>=50 && cur.getPoint()<=59) {
				s5+='*';
			}
			if(cur.getPoint()>=60 && cur.getPoint()<=69) {
				s6+='*';
			}
			if(cur.getPoint()>=70 && cur.getPoint()<=79) {
				s7+='*';
			}
			if(cur.getPoint()>=80 && cur.getPoint()<=89) {
				s8+='*';
			}
			if(cur.getPoint()>=90 && cur.getPoint()<=99) {
				s9+='*';
			}
			if(cur.getPoint()==100) {
				s10+='*';
			}
		}
		System.out.println("00-09: " + s);
		System.out.println("10-19: " + s1);
		System.out.println("20-29: " + s2);
		System.out.println("30-39: " + s3);
		System.out.println("40-49: " + s4);
		System.out.println("50-59: " + s5);
		System.out.println("60-69: " + s6);
		System.out.println("70-79: " + s7);
		System.out.println("80-89: " + s8);
		System.out.println("90-99: " + s9);
		System.out.println("100: " + s10);
	}
}
