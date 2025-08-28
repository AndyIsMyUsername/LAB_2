/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.andy;

/**
 *
 * @author 6223602
 */
public class GradedActivity {

   public double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public char getGrade() {
        if (score >= 90 ) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if ( score >= 70) {
            return 'C';
        } else if( score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
     public static void main(String[] args) {
        
    }
    
}
