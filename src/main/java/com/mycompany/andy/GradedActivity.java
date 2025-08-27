/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.andy;

/**
 *
 * @author 6223602
 */
public class GradedActivity {

   
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public char getGrade() {
        if (score >= 90 ) {
            return 'A';
        } else if (score >= 80 && score <= 90) {
            return 'B';
        } else if ( score >= 70 && score <= 80) {
            return 'C';
        } else if( score >= 60 && score <= 70) {
            return 'D';
        } else {
            return 'E';
        }
    }
    
    
     public static void main(String[] args) {
        
    }
    
}
