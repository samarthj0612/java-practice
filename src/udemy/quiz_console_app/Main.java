package udemy.quiz_console_app;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, welcome to the Quiz Console App!");

    QuestionService questionService = new QuestionService(6);
    questionService.playQuiz();
    questionService.displayResults();
    questionService.printScore();
  }
}