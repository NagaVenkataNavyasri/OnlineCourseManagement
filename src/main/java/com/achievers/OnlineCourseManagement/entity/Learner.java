package com.achievers.OnlineCourseManagement.entity;
/*
 * - Learner
		- enrollmentNo
		- learnerName
		- noOfRegisteredCourse
		- noOfCompletedCourse
 * */
public class Learner {
	private int enrollmentNo;
	private String learnerName;
	private int noOfRegisteredCourse;
	private int noOfCompletedCourse;
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Learner(int enrollmentNo, String learnerName) {
		super();
		this.enrollmentNo = enrollmentNo;
		this.learnerName = learnerName;
	}
	public int getEnrollmentNo() {
		return enrollmentNo;
	}
	public void setEnrollmentNo(int enrollmentNo) {
		this.enrollmentNo = enrollmentNo;
	}
	public String getLearnerName() {
		return learnerName;
	}
	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}
	public int getNoOfRegisteredCourse() {
		return noOfRegisteredCourse;
	}
	public void enrollCourse() {
		this.noOfRegisteredCourse++;
	}
	
	public void completeCourse() {
		this.noOfCompletedCourse++;
	}
	public int getNoOfCompletedCourse() {
		return noOfCompletedCourse;
	}
	public void setNoOfCompletedCourse(int noOfCompletedCourse) {
		this.noOfCompletedCourse = noOfCompletedCourse;
	}
	@Override
	public String toString() {
		return "Learner [enrollmentNo=" + enrollmentNo + ", learnerName=" + learnerName + ", noOfRegisteredCourse="
				+ noOfRegisteredCourse + ", noOfCompletedCourse=" + noOfCompletedCourse + "]";
	}
	
}
