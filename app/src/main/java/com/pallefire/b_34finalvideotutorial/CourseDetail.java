package com.pallefire.b_34finalvideotutorial;

/**
 * Created by RASHMI on 9/29/2016.
 */
public class CourseDetail {

    String cName,cDuration ,cAssignment,ctest;

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcDuration() {
        return cDuration;
    }

    public void setcDuration(String cDuration) {
        this.cDuration = cDuration;
    }

    public String getcAssignment() {
        return cAssignment;
    }

    public void setcAssignment(String cAssignment) {
        this.cAssignment = cAssignment;
    }

    public String getcTest() {
        return ctest;
    }

    public void setcTest(String ctest) {
        this.ctest = ctest;
    }
    public CourseDetail(String cName,String cDuration ,String cAssignment,String ctest){
        this.cName =cName;
        this.cDuration =cDuration;
        this.cAssignment = cAssignment;
        this.ctest = ctest;

    }
}
