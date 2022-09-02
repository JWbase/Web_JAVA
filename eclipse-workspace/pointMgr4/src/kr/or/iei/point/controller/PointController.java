package kr.or.iei.point.controller;

public interface PointController {

	// 메인메뉴가 출력되는 인터페이스
	public void main();

	//회원등록메소드
	public void insertMember();

	//회원전체정보출력메소드
	public void printAllMember();

	//회원 1명 정보 출력 메소드
	public void printOneMember();

	//회원정보수정메소드
	public void updateMember();

	//회원정보 삭제 메소드
	public void deleteMember();

	//입력받은 이름이 배열에 몇번째에 있는지 찾아서 리턴하는 메소드
	public int searchMember(String name);

}
