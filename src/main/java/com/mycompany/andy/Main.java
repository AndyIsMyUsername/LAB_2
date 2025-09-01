/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.andy;

import java.util.Scanner;

/**
 *
 * @author luoan
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //lab section
        System.out.println("Lab Score : ");
        double labScore = in.nextDouble();
        GradedActivity lab = new GradedActivity();
        lab.setScore(labScore);
        
        //passfail section
        System.out.println("Enter number of questions in Pass/Fail Exam: ");
        int pfQuestions = in.nextInt();
        System.out.println("Enter number of questions missed in Pass/Fail Exam: ");
        int pfMissed = in.nextInt();
        System.out.println("Enter minimum passing score: ");
        double minPassing = in.nextDouble();
        
       PassFailExam pfExam = new PassFailExam(pfQuestions,pfMissed,minPassing);
        
       //Essay
       System.out.println("Enter essay scores: ");
       System.out.println("Grammar (0-30)");
       double grammar = in.nextDouble();
       System.out.println("Spelling (0-20)");
       double spelling = in.nextDouble();
       System.out.println("Length (0-20)");
       double length= in.nextDouble();
       System.out.println("Content (0-30)");
       double content= in.nextDouble();
        
       EssayClass essay = new EssayClass(grammar,spelling,length,content);
        
        //final exam section
       System.out.println("How many question are on the final exam? :");
       int numQuestions = in.nextInt();
       System.out.println("How many questions did the student miss? :");
       int numMissed = in.nextInt();
        
       FinalExam finalExam = new FinalExam(numQuestions, numMissed);
        
       CourseGrades course = new CourseGrades();
       
       course.setLab(lab);
       course.setPassFailExam(pfExam);
       course.setEssay(essay);
       course.setFinalExam(finalExam);
       
       System.out.println("COURSE GRADES:");
       System.out.println(course);
        
       System.out.println("Average Score: "  + course.getAverage());
       System.out.println("Highest Score : "  + course.getHighest().getScore());
       System.out.println("Lowest Score: "  + course.getLowest().getScore());
       
    }
}
