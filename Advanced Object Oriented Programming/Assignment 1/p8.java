import java.util.*;

class Student{
	String name;
	int roll;
	double score;
	Student(int roll){
		name = "John Doe";
		this.roll = roll;
		this.score = 40;
	}
	Student(int roll, String name){
		this.name = name;
		this.roll = roll;
		this.score = 40;
	}
		
	
	Student(String name, int roll, double score){
		this.name = name;
		this.roll = roll;
		this.score = score;
	}
	
	void setName(String name){
		this.name = name;
	}
	void setRoll(int roll){
		this.roll = roll;
	}
	void setScore(double score){
		this.score = score;
	}
	void displayStudent(){
		System.out.println("Name: " + name + "\nRoll: " + roll + "\nScore: " + score);
	}
	Student(Student s){
		this.name = s.name;
		this.roll = s.roll;
		this.score = s.score;
	}
	public static void main(String args[]){
		Student s1 = new Student("Titir", 1, 75.57);
		Student s2 = new Student(s1);
		if(s1 == s2){
			System.out.println("Shallow Copy");
		}
		else
			System.out.println("Deep Copy");
	}
}
			


