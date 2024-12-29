package com.app.QuizApp;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/* @author Bhumi Jain*/
public class Main {
    public static void main(String []args){
            Quiz q= new Quiz();
            q.logic();
    }
}
class Quiz{
    Scanner sc=new Scanner(System.in);
    int correct=0;
    int wrong=0;
    public void logic(){
        questions q1 = new questions(" Which statement is true about Java?", "A. Java is a sequence-dependent programming language ", "B. Java is a code dependent programming language ", "C. Java is a platform-dependent programming language ", "D. Java is a platform-independent programming language ");
        questions q2 = new questions("What is the extension of java code files?", " A. .txt", "B. .pdf", "C. .sql", "D. .java");
        questions q3 = new questions("Who invented Java Programming? ", "A. Guido van Rossum", "B. James Gosling", "C. Dennis Ritchie", "D. Bjarne Stroustrup");
        questions q4 = new questions("Which one of the following is not a Java feature?", "A. Object-oriented", "B. Use of pointers", "C. Portable", "D. Dynamic and Extensible");
        questions q5 = new questions("Which of these cannot be used for a variable name in Java?", "A. identifier & keyword", "B. identifier", "C. Keyword", "D. none of the mentioned");
        
        Map<questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2, 'D');
        hmap.put(q3,'B');
        hmap.put(q3, 'B');
        hmap.put(q5,'C');
        
        for (Map.Entry<questions,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());
            
            System.out.println("enter your answer: ");
            Character ans=sc.next().charAt(0);
            int cans=Character.compare(ans, map.getValue());
            if(cans==0){
                System.out.println("YEAHHH!! Correct Answer");
                correct++;
            }
            else{
                System.out.println("Oops!! Wrong answer");
                wrong++;}
        }
            System.out.println();
            System.out.println("-------RESULT------");
            System.out.println("Total Questions:" + hmap.size());
            System.out.println("Corrected Answer:" + correct);
            System.out.println("Wrong Answer:" + wrong);
            int per= 100*correct/hmap.size();   
            System.out.println("Percentage: "+ per +"%");
            if(per>95){
                System.out.println("Performance: Excellent");
            }
            else if(per>80){
                System.out.println("Performance: Very Good");
            } 
            else if(per>70){
                System.out.println("Performance: Good");
            } 
            else if(per<35){
                System.out.println("Performance: Low ");
            }
            else{
                System.out.println("Performance: Medium");
            }  
    }
}
