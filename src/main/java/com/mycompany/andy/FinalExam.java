/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.andy;

import java.util.Set;


public class FinalExam extends GradedActivity {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;
    
    public FinalExam (int questions , int missed) {
        numQuestions = questions;
        numMissed = missed;
        
        pointsEach = 100/ questions;
        double numbericScore = 100 - (missed * pointsEach);
        setScore(score);
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }
}
