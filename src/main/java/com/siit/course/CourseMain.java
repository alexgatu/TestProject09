package com.siit.course;

import static com.siit.course.Course03.course03;
import static com.siit.course.Course04.runCourseCode4;
import static com.siit.course.Course05.*;
import static com.siit.course.Course06.runCourse06;
import static com.siit.course.Course07.*;


public class CourseMain {
    public static void main(String[] args) {
//        course03(args);
//        runCourseCode4();
//        runCourse05(args);
//        runCourse06();
        try {
            runCourse07(args);
        }
        catch (ArrayIndexOutOfBoundsException aob) {
            System.out.println(aob.getMessage());
        }
    }
}
