package users;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import java.util.Vector;

import Book.Book;
import course.Course;
import course.CourseFile;
import mark.Mark;
import other.News;

public final class Database implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String BASEPATH = "C:\\OOP\\test\\";
	private static Database instance = new Database(BASEPATH);
	private String value;
	
	public Database() {
		
	}
	private Database(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}

	public static Database getInstance() {
		return instance;
	}
	
	public static Vector<User> users = new Vector<User>();
	public static Vector<Student> students = new Vector<Student>();
	public static Vector<Employee> employees = new Vector<Employee>();
	public static Vector<Manager> managers = new Vector<Manager>();
	public static Vector<Teacher> teachers = new Vector<Teacher>();
	public static Vector<Librarian> librarians = new Vector<Librarian>();
	public static Vector<Admin> admins = new Vector<Admin>();
	public static Vector<Course> courses = new Vector<Course>();
	public static Vector<Mark> marks = new Vector<Mark>();
	public static Vector<Book> books = new Vector<Book>();
	public static HashMap<Student, Book> studentBooks = new HashMap<Student, Book>();
	public static Vector<News> news = new Vector<News>();
	public static Vector<String> comments = new Vector<String>();
	public static Vector<CourseFile> files = new Vector<CourseFile>();
	
	
	public static void save() {
		serializeUser();
		serializeStudent();
		serializeTeacher();
		serializeAdmin();
		serializeEmployee();
		serializeCourse();
		serializeMark();
		serializeBook();
		serializeLibrarian();
		serializeManager();
		serializeNews();
		serializeFile();
	}
	
	public static void serializeUser() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "users.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(users);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public static Vector<User> deserializeUser() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "users.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<User> u = (Vector<User>)ois.readObject();
			return u;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return users;
	}
	
//	Student
	public static void serializeStudent() {
		try (FileOutputStream fs = new FileOutputStream(BASEPATH + "students.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			oos.writeObject(students);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Student> deserializeStudent() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "students.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Student> s = (Vector<Student>)ois.readObject();
			return s;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return students;
	}
	
//	Employee
	public static void serializeEmployee() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "employees.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(employees);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Employee> deserializeEmployee() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "employees.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Employee> e = (Vector<Employee>)ois.readObject();
			return e;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return employees;
	}
	
//	Manager
	public static void serializeManager() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "managers.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(managers);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public Vector<Manager> deserializeManager() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "managers.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Manager> m = (Vector<Manager>)ois.readObject();
			return m;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return managers;
	}
	
//	Teacher
	public static void serializeTeacher() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "teachers.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(teachers);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Teacher> deserializeTeacher() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "teachers.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Teacher> t = (Vector<Teacher>)ois.readObject();
			return t;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return teachers;
	}
	
//	Librarian
	public static void serializeLibrarian() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "librarians.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(librarians);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Librarian> deserializeLibrarian() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "librarians.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Librarian> l = (Vector<Librarian>)ois.readObject();
			return l;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return librarians;
	}
	
//	Admin
	public static void serializeAdmin() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "admins.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(admins);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Admin> deserializeAdmin() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "admins.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Admin> a = (Vector<Admin>)ois.readObject();
			return a;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return admins;
	}
	
//	Course
	public static void serializeCourse() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "courses.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(courses);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Course> deserializeCourse() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "courses.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Course> c = (Vector<Course>)ois.readObject();
			return c;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return courses;
	}
	
//	Mark
	public static void serializeMark() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "marks.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(marks);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<Mark> deserializeMark() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "marks.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Mark> m = (Vector<Mark>)ois.readObject();
			return m;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return marks;
	}
	
//	Book
	public static void serializeBook() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "books.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(books);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	

	
	public static Vector<Book> deserializeBook() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "books.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<Book> b = (Vector<Book>)ois.readObject();
			return b;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return books;
	}
	
//	News
	public static void serializeNews() {
		try (FileOutputStream fis = new FileOutputStream(BASEPATH + "news.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(news);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<News> deserializeNews() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "news.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<News> n = (Vector<News>)ois.readObject();
			return n;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return news;
	}
	
//	File
	public static void serializeFile() {
		try (FileOutputStream fs = new FileOutputStream(BASEPATH + "files.txt")){
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			oos.writeObject(files);
			oos.flush();
			oos.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public static Vector<CourseFile> deserializeFile() throws ClassNotFoundException {
		try (FileInputStream fs = new FileInputStream(BASEPATH + "files.txt")){
			ObjectInputStream ois = new ObjectInputStream(fs);
			@SuppressWarnings("unchecked")
			Vector<CourseFile> cs = (Vector<CourseFile>)ois.readObject();
			return cs;
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		return files;
	}
}