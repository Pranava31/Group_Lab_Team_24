/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bussiness.Academic;

/**
 *
 * @author HP
 */

import java.util.ArrayList;

public class CourseDirectory {

    private ArrayList<Course> courseList;

    public CourseDirectory() {
        courseList = new ArrayList<>();
    }

    // Add a new course
    public Course addCourse(String courseId, String courseName, String instructor, int credits, String semester, int capacity) {
        Course c = new Course(courseId, courseName, instructor, credits, semester, capacity);
        courseList.add(c);
        return c;
    }

    // Get all courses
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    // Remove a course
    public void removeCourse(Course c) {
        courseList.remove(c);
    }

    // Find a course by ID
    public Course findCourse(String courseId) {
        for (Course c : courseList) {
            if (c.getCourseId().equalsIgnoreCase(courseId)) {
                return c;
            }
        }
        return null;
    }
}

