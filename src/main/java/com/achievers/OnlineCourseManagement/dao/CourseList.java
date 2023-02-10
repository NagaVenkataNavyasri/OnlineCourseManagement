package com.achievers.OnlineCourseManagement.dao;

import java.util.List;
import java.util.ArrayList;

import com.achievers.OnlineCourseManagement.entity.Course;

public class CourseList {
	private static ArrayList<Course> courseList = new ArrayList<Course>();
	
	public static List<Course> getCourseList(){
		return courseList;
	}
}
