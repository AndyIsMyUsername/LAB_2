/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.andy;

/**
 *
 * @author 6223602
 */
public class PassFailActivity extends GradedActivity {
    private double minPassingScore;
    
    public PassFailActivity(double minPassingScore) {
        this.minPassingScore = minPassingScore;
    }

    @Override
    public char getGrade() {
        if (getScore() >= minPassingScore) return 'P';
        else return 'F';
    }       
}
