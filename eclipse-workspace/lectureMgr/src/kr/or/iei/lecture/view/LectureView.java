package kr.or.iei.lecture.view;

import java.util.Scanner;

import kr.or.iei.lecture.vo.CulturalStudies;
import kr.or.iei.lecture.vo.Major;
import kr.or.iei.lecture.vo.SubjectType;

public class LectureView {

	Scanner sc;

	public LectureView() {
		super();
		sc = new Scanner(System.in);
	}

	public int showMain() {
		System.out.println("====== Manager // Studnet Select =====");
		System.out.println();
		System.out.println("1. Manager");
		System.out.println("2. Studnet");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 > ");
		int sel = sc.nextInt();

		return sel;
	}

	public void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	public int managerView() {
		System.out.println("====== Manager Mod ======");
		System.out.println();
		System.out.println("1. 강의 추가");
		System.out.println("2. 강의 삭제");
		System.out.println("3. 전체 강의 목록 확인");
		System.out.println("4. 강의 검색");
		System.out.println("0. 처음으로");
		System.out.print("선택 > ");
		int sel = sc.nextInt();
		return sel;
	}

	public SubjectType insertLecture() {
		System.out.println("============ 강의 추가하기 =============");
		System.out.print("추가할 과목명 입력 : ");
		sc.nextLine();
		String subjectName = sc.nextLine();
		System.out.print("해당하는 과목의 학점 입력[1 ~ 3] : ");
		int score = sc.nextInt();
		System.out.print("해당하는 과목의 교수명 입력 : ");
		String professorName = sc.next();
		System.out.print("해당하는 과목의 강의실 입력[101 ~ 200] : ");
		int room = sc.nextInt();
		System.out.print("해당하는 과목의 수강요일 입력[월,화,수,목,금] : ");
		String day = sc.next();
		System.out.print("해당하는 과목의 시작교시 입력[1 ~ 9] : ");
		int startTime = sc.nextInt();
		System.out.print("해당하는 과목타입 입력[교양 / 전공] : ");
		String subjectType = sc.next();

		SubjectType sub = null;
		switch (subjectType) {
		case "전공":
			Major m = new Major(subjectName, score, professorName, room, day, startTime, subjectType);
			sub = (SubjectType) m;
			break;
		case "교양":
			CulturalStudies cul = new CulturalStudies(subjectName, score, professorName, room, day, startTime,
					subjectType);
			sub = (SubjectType) cul;
			break;
		}
		return sub;
	} // insertLecture() end

	public String deleteLecture() {
		System.out.println("============= 강의 삭제하기 ==============");
		System.out.print("삭제할 강의 이름을 입력해주세요 : ");

		sc.nextLine();
		String lectureName = sc.nextLine();
		return lectureName;
	} // deleteLecture() end

	public void deleteComplete() {
		System.out.println("강의 삭제가 완료되었습니다!");
	} // deleteComplete() end

	public void noSearchLecture() {
		System.out.println("강의 정보를 찾을 수 없습니다.");
	} // noSearchLecture() end

	public void printAllLecture(SubjectType[] subjects, int index) {
		System.out.println("============ 전체 강의 출력 =============");
		System.out.println("과목명(구분)\t   학점\t교수명\t요일\t시작시간\t강의실");
		for (int i = 0; i < index; i++) {
			SubjectType st = subjects[i];
			System.out.printf("%s(%s)\t%d\t%s\t%s\t%d교시\t\t%d", st.getSubjectName(), st.getSubjectType(), st.getScore(),
					st.getProfessorName(), st.getDay(), st.getStartTime(), st.getRoom());
			System.out.println();
		}
	} // printAllLecture(SubjectType[] subjects, int index) end

	public String printOneLecture() {
		System.out.print("강의 이름을 입력해주세요 : ");
		sc.nextLine();
		String name = sc.nextLine();
		return name;
	} // printOneLecture()

	public void printOneLecture(SubjectType[] subjects, int searchIndex) {
		SubjectType sub = subjects[searchIndex];
		System.out.println("과목명 : " + sub.getSubjectName());
		System.out.println("학점 : " + sub.getScore());
		System.out.println("교수명 : " + sub.getProfessorName());
		System.out.println("강의 날짜 : " + sub.getDay());
		System.out.println("강의실 : " + sub.getRoom() + "호");
	} // printOneLecture(SubjectType[] subjects, int searchIndex) end

	public int studentView() {
		System.out.println("====== Student Mod ======");
		System.out.println();
		System.out.println("1. 전체 시간표 조회");
		System.out.println("2. 수강 신청");
		System.out.println("3. 수강 삭제");
		System.out.println("4. 강의 검색");
		System.out.println("5. 수강신청 확인");
		System.out.println("0. 종료");
		System.out.print("선택 > ");

		int sel = sc.nextInt();
		return sel;
	} // studentView() end

	public void printAllClass(SubjectType[] subjects, int index) {
		System.out.println("====== 전체 수업 조회 ======");
		System.out.println("과목명(구분)\t   학점\t교수명\t요일\t시작교시\t강의실");

		for (int i = 0; i < index; i++) {
			SubjectType st = subjects[i];
			System.out.printf("%s(%s)\t%d\t%s\t%s\t%d교시\t\t%d", st.getSubjectName(), st.getSubjectType(), st.getScore(),
					st.getProfessorName(), st.getDay(), st.getStartTime(), st.getRoom());
			System.out.println();
		}
	} // printAllClass(SubjectType[] subjects, int index)

	public String getName(String str) {

		System.out.println("====== 수강과목 " + str + " ======");
		System.out.print("강의명 입력 : ");
		sc.nextLine();
		String name = sc.nextLine();

		return name;
	} // getNema(Stirng str) end

	public void findLecture(int searchIndex, SubjectType[] subjects) {

		SubjectType sType = subjects[searchIndex];
		System.out.println("교양 / 전공 : " + sType.getSubjectType());
		System.out.println("강의 이름 : " + sType.getSubjectName());
		System.out.println("교수 이름 : " + sType.getProfessorName());
		System.out.println("학점 : " + sType.getScore());
		System.out.println("강의실 : " + sType.getRoom());
		System.out.println("요일 : " + sType.getDay());
		System.out.println("시작 시간 : " + sType.getStartTime() + "교시");
	} // end findLecture(int searchIndex, SubjectTpye[] subjects) end

	public void fault() {
		System.out.println("잘못 입력하셨습니다.");
	} // fault() end

	public void printOneLectureStudent(SubjectType[] subjects, int searchIndex) {
		SubjectType sub = subjects[searchIndex];
		System.out.println("과목명(구분)\t   학점\t교수명\t요일\t시작교시\t강의실");
		System.out.printf("%s(%s)\t%d\t%s\t%s\t%d교시\t\t%d", sub.getSubjectName(), sub.getSubjectType(), sub.getScore(),
				sub.getProfessorName(), sub.getDay(), sub.getStartTime(), sub.getRoom());
		System.out.println();
	} // printOneLectureStudent(SubjectType[] subjects, int searchIndex) end

	// 학생용 뷰

	public String insertLectureStudent() {
		System.out.print("등록할 과목명을 입력하세요 : ");
		sc.nextLine();
		String subjectName = sc.nextLine();

		return subjectName;
	} // insertLectureStudent()

	public boolean checkLectureStudent(SubjectType subject, int scheduler[][]) {
		//subject에서 
		boolean check = true;
		for (int i = subject.getStartTime() - 1; i < subject.getStartTime() + subject.getScore() - 1; i++) {
			switch (subject.getDay()) {
			case "월":
				if (scheduler[i][1] == 1) {
					check = false;
				}
				break;
			case "화":
				if (scheduler[i][2] == 1) {
					check = false;
				}
				break;
			case "수":
				if (scheduler[i][3] == 1) {
					check = false;
				}
				break;
			case "목":
				if (scheduler[i][4] == 1) {
					check = false;
				}
				break;
			case "금":
				if (scheduler[i][5] == 1) {
					check = false;
				}
				break;
			}
		}
		if (check) {
			for (int i = subject.getStartTime() - 1; i < subject.getStartTime() + subject.getScore() - 1; i++) {
				switch (subject.getDay()) {
				case "월":
					for (int k = subject.getStartTime() - 1; k < subject.getStartTime() - 1 + subject.getScore(); k++) {
						for (int j = 0; j < scheduler[k].length; j++) {
							scheduler[k][1] = 1;
						}
					}
					break;
				case "화":
					for (int k = subject.getStartTime() - 1; k < subject.getStartTime() - 1 + subject.getScore(); k++) {
						for (int j = 0; j < scheduler[k].length; j++) {
							scheduler[k][2] = 1;
						}
					}

					break;
				case "수":
					for (int k = subject.getStartTime() - 1; k < subject.getStartTime() - 1 + subject.getScore(); k++) {
						for (int j = 0; j < scheduler[k].length; j++) {
							scheduler[k][3] = 1;
						}
					}

					break;
				case "목":
					for (int k = subject.getStartTime() - 1; k < subject.getStartTime() - 1 + subject.getScore(); k++) {
						for (int j = 0; j < scheduler[k].length; j++) {
							scheduler[k][4] = 1;
						}
					}
					break;
				case "금":
					for (int k = subject.getStartTime() - 1; k < subject.getStartTime() - 1 + subject.getScore(); k++) {
						for (int j = 0; j < scheduler[k].length; j++) {
							scheduler[k][5] = 1;
						}
					}
					break;
				}
			}
		}
		return check;
	}

	public void completeRegister() {
		System.out.println("수강신청이 완료 되었습니다.");
	}

	public void failRegister() {
		System.out.println("겹치는 시간표가 있습니다. 확인해주세요.");
	}

	public void printAllregister(int studentIndex, SubjectType[] studentSubjects, int scheduler[][]) {

		System.out.println("  월 화 수 목 금");
		for (int k = 0; k < scheduler.length; k++) {
			for (int j = 0; j < scheduler[k].length; j++) {
				if (scheduler[k][j] == 1) {
					System.out.print("■  ");
				} else if (j == 0) {
					System.out.print(k + 1 + "  ");
				} else {
					System.out.print("□  ");
				}
			}
			System.out.println();
		}

		System.out.println("과목명(구분)\t   학점\t교수명\t요일\t시작교시\t강의실");

		for (int i = 0; i < studentIndex; i++) {
			SubjectType stType = studentSubjects[i];
			System.out.printf("%s(%s)\t%d\t%s\t%s\t%d교시\t\t%d", stType.getSubjectName(), stType.getSubjectType(),
					stType.getScore(), stType.getProfessorName(), stType.getDay(), stType.getStartTime(),
					stType.getRoom());
			System.out.println();
		}

	} // printAllregister(int studentIndex, SubjectType[] studentSubjects) end

}