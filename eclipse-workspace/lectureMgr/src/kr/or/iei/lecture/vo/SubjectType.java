package kr.or.iei.lecture.vo;

public class SubjectType {

	private String subjectName; // 과목명
	private int score; // 학점
	private String professorName; // 교수명
	private int room; // 강의실
	private int startTime; // 수업 시작 시간
	private String day; // 요일(월,화,수,목,금)
	private String subjectType; // 과목타입(교양 or 전공)

	public SubjectType() {
		super();
	}

	public SubjectType(String subjectName, int score, String professorName, int room, String day, int startTime,
			String subjectType) {
		super();
		this.subjectName = subjectName;
		this.score = score;
		this.professorName = professorName;
		this.room = room;
		this.startTime = startTime;
		this.day = day;
		this.subjectType = subjectType;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}
}