package com.bootcoding.method;

public class GradeSystem {

    public static void main(String[] args) {
        int[] studentPercentages = {67,58,99,69,35,87};
        char[] gradeResults = calculateGrade(studentPercentages);
        for(int i = 0 ; i < gradeResults.length; i++){
            System.out.println("Student percentage = " + studentPercentages[i] + " -> " + gradeResults[i] + " Grade ");
        }
    }

    public static char[] calculateGrade(int[] studentPercentages) {
        char[] grades = new char[studentPercentages.length];
        char grade = 0;
        for (int i = 0; i < studentPercentages.length; i++) {
            int percentage = studentPercentages[i];
            grade = getGrade(percentage);
            grades[i] = grade;
        }
        return grades;
    }

    private static char getGrade(int percentage) {
        char grade;
        if(percentage >= 75){
            grade = 'A';
        }else if(percentage >= 60){
            grade = 'B';
        }else{
            grade = 'C';
        }
        return grade;
    }


}


// Task 1
// requirement = [10,5,7,2,0,9] Give discount to people
// above 8 = 50%
// above 5 = 30%
// above 2 = 10%
