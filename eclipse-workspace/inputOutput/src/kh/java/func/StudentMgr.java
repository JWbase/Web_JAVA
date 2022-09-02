package kh.java.func;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMgr {

	private ArrayList<Student> students;
	private Scanner sc;

	public StudentMgr() {
		super();
		importStudent();
		sc = new Scanner(System.in);
	}

	public void main() {
		while (true) {
			System.out.println("1. 학생정보등록");
			System.out.println("2. 전체조회");
			System.out.println("3. 정보내보내기");
			System.out.println("4. 정보불러내기");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				insertStudent();
				break;
			case 2:
				printAllStudent();
				break;
			case 3:
				exportStudent();
				//students를 직렬화해서 내보내기
				//파일이름은 students.txt
				break;
			case 4:
				importStudent();
				break;
			case 0:
				exportStudent();
				return;
			}
		}
	}

	public void insertStudent() {
		System.out.println("====== 학생정보등록 ======");
		System.out.print("학생 이름 입력 : ");
		String name = sc.next();
		System.out.print("학생 나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("학생 주소 입력 : ");
		sc.nextLine();
		String addr = sc.nextLine();
		Student s = new Student(name, age, addr);
		students.add(s);
	}

	public void printAllStudent() {
		System.out.println("전체 학생 조회");
		System.out.println("이름\t나이\t주소");
		for (Student s : students) {
			System.out.println(s.getName() + "\t" + s.getAge() + "\t" + s.getAddr());
		}
	}

	public void exportStudent() {

		ObjectOutputStream oos = null;
		try {
			FileOutputStream fos = new FileOutputStream("students.txt");
			try {
				oos = new ObjectOutputStream(fos);
				oos.writeObject(students);
				System.out.println("객체 내보내기 완료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void importStudent() {
		ObjectInputStream ois = null;
		try {
			FileInputStream fis = new FileInputStream("students.txt");
			ois = new ObjectInputStream(fis);
			students = (ArrayList<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}