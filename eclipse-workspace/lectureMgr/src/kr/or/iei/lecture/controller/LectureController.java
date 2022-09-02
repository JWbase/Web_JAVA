package kr.or.iei.lecture.controller;

public interface LectureController {

	public void main();

	public void insertLecture();

	public void printAllLecture();

	public void deleteLecture();

	public int searchLecture(String subjectName);
}