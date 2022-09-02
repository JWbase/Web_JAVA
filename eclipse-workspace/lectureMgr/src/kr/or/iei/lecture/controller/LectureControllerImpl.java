package kr.or.iei.lecture.controller;

import kr.or.iei.lecture.view.LectureView;
import kr.or.iei.lecture.vo.SubjectType;

public class LectureControllerImpl implements LectureController {

	private int index; // 관리자 수업 추가시 인덱스
	private int studentIndex; // 학생 수강신청 인덱스
	private SubjectType[] subjects;
	private SubjectType[] studentSubjects;
	private int scheduler[][];
	private LectureView view;

	public LectureControllerImpl() {
		super();

		scheduler = new int[9][6];
		subjects = new SubjectType[15];
		studentSubjects = new SubjectType[15];
		view = new LectureView();
	}

	// 전체메인

	@Override
	public void main() {

		while (true) {

			int sel = view.showMain();

			switch (sel) {

			case 1:
				managerMain();
				break;

			case 2:
				studentMain();
				break;
			case 0:
				view.exit();
				return;

			default:
				view.fault();
				break;
			}
		}
	}

	// 전체 메인 끝

	// 관리자 시작

	public void managerMain() {
		while (true) {
			int sel = view.managerView();
			switch (sel) {
			case 1:
				insertLecture();
				break;
			case 2:
				deleteLecture();
				break;
			case 3:
				printAllLecture();
				break;
			case 4:
				printOneLecture();
				break;
			case 0:
				return;
			default:
				view.fault();
				break;
			}
		}
	}

	@Override
	public void insertLecture() {
		SubjectType s = view.insertLecture();
		subjects[index++] = s;
	}

	@Override
	public void printAllLecture() {
		view.printAllLecture(subjects, index);
	}

	@Override
	public void deleteLecture() {
		int selectIndex = searchLecture(view.deleteLecture());
		if (selectIndex == -1) {
			view.noSearchLecture();
		} else {
			for (int i = selectIndex; i < index - 1; i++) {
				subjects[i] = subjects[i + 1];
			}
			index--;
			view.deleteComplete();
		}
	}

	@Override
	public int searchLecture(String subjectName) {
		for (int i = 0; i < index; i++) {
			SubjectType sType = subjects[i];
			if (subjectName.equals(sType.getSubjectName())) {
				return i;
			}
		}
		return -1;
	}

	public void printOneLecture() {
		String name = view.printOneLecture();

		int searchIndex = searchLecture(name);
		if (searchIndex == -1) {
			view.noSearchLecture();
		} else {
			view.printOneLecture(subjects, searchIndex);
		}
	}

	// 관리자 끝

	// 학생 시작

	public void studentMain() {

		while (true) {
			int sel = view.studentView();
			switch (sel) {
			case 1:
				printAllLectureStudent();
				break;
			case 2:
				insertLectureStudent();
				break;
			case 3:
				deleteLectureStudent();
				break;
			case 4:
				printOneLectureStudent();
				break;
			case 5:
				findLecture2();
				break;
			case 0:
				return;
			default:
				view.fault();
				break;
			}
		}
	} // end studentMain();

	public void printAllLectureStudent() {
		view.printAllClass(subjects, index);
	}

	public void insertLectureStudent() {
		view.printAllClass(subjects, index);
		int searchIndex = searchLecture(view.insertLectureStudent());

		if (searchIndex == -1) {
			view.fault();
		} else {
			if (view.checkLectureStudent(subjects[searchIndex], scheduler)) {
				studentSubjects[studentIndex++] = subjects[searchIndex];
				view.completeRegister();
			} else {
				view.failRegister();
			}
		}
	}

	public void deleteLectureStudent() {

		int selectIndex = searchLecture(view.insertLectureStudent());
		if (selectIndex == -1) {
			view.noSearchLecture();
		} else {
			for (int i = selectIndex; i < studentIndex - 1; i++) {
				studentSubjects[i] = studentSubjects[i + 1];
			}
			studentIndex--;
			view.deleteComplete();
		}
	}

	public void printOneLectureStudent() {
		String name = view.printOneLecture();

		int searchIndex = searchLecture(name);
		if (searchIndex == -1) {
			view.noSearchLecture();
		} else {
			view.printOneLectureStudent(subjects, searchIndex);
		}

	}
	// 학생 끝

	public void findLecture() { // 강의 검색

		String name = view.getName("검색");

		int searchIndex = searchLecture(name);

		if (searchIndex == -1) {
			view.fault();
		} else {
			view.findLecture(searchIndex, subjects);
		}
	} // findLecture() end

	public void findLecture2() {
		view.printAllregister(studentIndex, studentSubjects, scheduler);

	} // findLecture() end

}