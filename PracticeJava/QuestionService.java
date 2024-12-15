package PracticeJava;

import java.util.Scanner;

public class QuestionService{
   
    Questions[] questions = new Questions[4];
    String selection[] = new String[4];


    public QuestionService()
    {
        questions[0] = new Questions(1,"What are you Studying !", "java", "cpp", "Python", "JavaScript","Java");
        questions[1] = new Questions(2,"What are you Studying !", "java", "cpp", "Python", "JavaScript","Java");
        questions[2] = new Questions(3,"What are you Studying !", "java", "cpp", "Python", "JavaScript","Java");
        questions[3] = new Questions(4,"What are you Studying !", "java", "cpp", "Python", "JavaScript","Java");
      

    }

    public void playQuiz()
    {   
       // questions[0] = new Questions(); // creating the object of the question
          
        int i =0;
        for(Questions q: questions)
        {
            //System.out.println(q.getQuestions());
            System.out.println("Question No "+ q.getId());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i]= sc.nextLine();
            i++;

        }  

        for(String s: selection)
        {
            System.out.println(s);
        }  
    }

}

