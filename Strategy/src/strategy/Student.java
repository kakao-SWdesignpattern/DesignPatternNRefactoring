package strategy;

import java.util.ArrayList;

import strategy.grade.BasicEvaluation;
import strategy.grade.GradeEvaluation;
import strategy.grade.MajorEvaluation;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public static final int BASIC = 0;
	public static final int MAJOR = 1;
	
	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score, boolean majorCode){
		Subject subject = new Subject();
		
		subject.setName(name);
		subject.setScorePoint(score);
		subject.setMajorCode(majorCode);
		subjectList.add(subject);
	}
	
	public void showGradeInfo() {
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation()};
		
		for(Subject s : subjectList){
		
			String grade;
			int score = s.getScorePoint();
			if (s.isMajorCode() == true) {
				grade = gradeEvaluation[MAJOR].getGrade(score);
			}
			else {
				grade = gradeEvaluation[BASIC].getGrade(score);
			}
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + 
			        s.getScorePoint() + "점 이고, 학점은 " + grade +" 입니다.");
		
		}
	}
}
