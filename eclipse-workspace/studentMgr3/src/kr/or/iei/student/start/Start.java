package kr.or.iei.student.start;

import kr.or.iei.student.controller.StudentController;
import kr.or.iei.student.vo.Student;

public class Start {

	public static void main(String[] args) {
		
//		StudentController sc = new StudentController();
//		sc.main();
		Student s1 = new Student();
		Student s2 = new Student("이윤수", 20, "서울");
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddr());
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
