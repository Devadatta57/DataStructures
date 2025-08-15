package stacksprograms;

import java.util.Stack;

class Student{
	int no;
	String name;
	Student(int no,String name){
		this.no=no;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
	return no+" "+name;
	}
}
public class StackStudents {
	public static void main(String[] args) {
		
      Stack<Student> s = new Stack<Student>();
       Student  s1= new Student(111,"deva");
       Student  s2= new Student(178,"eva");
       Student  s3= new Student(190,"peva");
       Student  s4= new Student(122,"meva");

       s.push(s1);
       s.push(s2);
       s.push(s3);
       s.push(s4);
      

    System.out.println(s);
  //  System.out.println(s.peek());
    //System.out.println(s.search(s2));
    //System.out.println(s.pop());

	}
}
