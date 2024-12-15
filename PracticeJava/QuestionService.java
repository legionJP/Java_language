package PracticeJava;

import java.util.Scanner;

public class QuestionService{
   
    Questions[] questions = new Questions[4];
    String selection[] = new String[4];


    public QuestionService()
    {
        questions[0] = new Questions(1,"What are you Studying !", "java", "cpp", "Python", "javaScript","java");
        questions[1] = new Questions(2,"What are you Studying !", "java", "cpp", "Python", "javaScript","java");
        questions[2] = new Questions(3,"What are you Studying !", "java", "cpp", "Python", "javaScript","java");
        questions[3] = new Questions(4,"What are you Studying !", "java", "cpp", "Python", "javaScript","java");
      

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

    public void printScore()
    {
        int score =0;
        for(int i=0; i<questions.length; i++)
        {
            Questions que = questions[1];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if(actualAnswer.equals(userAnswer))
            {
                score++;
            }
        }
        System.out.println("Your score is : "+ score);
    }

}

