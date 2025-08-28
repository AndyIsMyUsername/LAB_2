/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.andy;


public class PassFailExam extends PassFailActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public PassFailExam (int questions, int missed, double minPassingScore) {
        super(minPassingScore);
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100/ questions;
        double score = 100 - (missed * pointEach);
        setScore(score);
    }
}
