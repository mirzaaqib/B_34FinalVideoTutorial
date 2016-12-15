package com.pallefire.b_34finalvideotutorial;

/**
 * Created by RASHMI on 9/29/2016.
 */
public class DemoVideosDetail {
    String courseNumber ,courseName,courseDuration,courseKey;
    public DemoVideosDetail(String courseNumber ,String courseName,String courseDuration,String courseKey){
        this.courseNumber =courseNumber;
        this.courseName =courseName;
        this.courseDuration =courseDuration;
        this.courseKey = courseKey;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseKey() {
        return courseKey;
    }

    public void setCourseKey(String courseKey) {
        this.courseKey = courseKey;
    }
}
