package org.siva;

public class GradeReturn {
   public String calculateGrade(int marks){
        if(marks<0){
            throw new IllegalArgumentException("You have entered negative number or entered wrong data type");
        } else if (marks<20) {
            return  "g";
        }
        else if (marks<30) {
            return  "f";
        }
        else if (marks<40) {
            return  "e";
        }
        else if (marks<50) {
            return  "d";
        }
        else if (marks<60) {
            return  "c";
        }
        else if (marks<70) {
            return  "b";
        }
        else if (marks<80) {
            return  "A";
        }else {
            return "A+";
        }
   }
}
