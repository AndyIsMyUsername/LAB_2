/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.andy;

/**
 *
 * @author 6223602
 */
public class CourseGrades implements Analyzable{
    private GradedActivity grades[] = new GradedActivity[4];
   
    public void setLab (GradedActivity g) {
        grades[0] = g;
    }
    
    public void setPassFailExam (PassFailExam pfe) {
        grades[1] = pfe;
    }
    
    public void setEssay (EssayClass e) {
        grades[2] = e;
    }
    
    public void setFinalExam (FinalExam FE) {
        grades[3] = FE;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String[] names = {"Lab", "PassFailExam", "Essay", " FinalExam" }; 
        
        for (int i = 0; i < grades.length; i++) {
        sb.append(names[i])
                .append(": Score = ").append(grades[i].getScore())
                .append(", Grade = ").append(grades[i].getGrade())
                .append("\n");
        }
        return sb.toString();
    }
}
