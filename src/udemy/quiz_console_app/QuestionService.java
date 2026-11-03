package udemy.quiz_console_app;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionService {
  private static final Question[] QUESTIONS_POOL = {
      new Question(1, "What is the capital of France?",
          new String[] { "Paris", "London", "Berlin", "Madrid" }, 'A'),

      new Question(2, "What is the capital of Germany?",
          new String[] { "Paris", "London", "Berlin", "Madrid" }, 'C'),

      new Question(3, "What is the capital of Spain?",
          new String[] { "Paris", "London", "Berlin", "Madrid" }, 'D'),

      new Question(4, "What is the capital of Italy?",
          new String[] { "Paris", "London", "Berlin", "Rome" }, 'D'),

      new Question(5, "What is the capital of Greece?",
          new String[] { "Paris", "London", "Berlin", "Athens" }, 'D'),

      new Question(6, "What is the capital of Portugal?",
          new String[] { "Paris", "London", "Berlin", "Lisbon" }, 'D'),

      new Question(7, "What is the capital of Netherlands?",
          new String[] { "Paris", "London", "Berlin", "Amsterdam" }, 'D'),

      new Question(8, "What is the capital of Belgium?",
          new String[] { "Paris", "London", "Berlin", "Brussels" }, 'D'),

      new Question(9, "What is the capital of Switzerland?",
          new String[] { "Paris", "London", "Berlin", "Bern" }, 'D'),

      new Question(10, "What is the capital of Austria?",
          new String[] { "Paris", "London", "Berlin", "Vienna" }, 'D')
  };

  private final Question[] questions;
  private final Character[] userAnswers;
  private final Scanner scanner;

  public QuestionService(int quizSize) {
    if (quizSize <= 0 || quizSize > QUESTIONS_POOL.length) {
      throw new IllegalArgumentException(
          "Quiz size must be between 1 and " + QUESTIONS_POOL.length);
    }

    this.questions = Arrays.copyOf(QUESTIONS_POOL, quizSize);
    this.userAnswers = new Character[quizSize];
    this.scanner = new Scanner(System.in);
  }

  public void playQuiz() {
    System.out.println("Displaying questions...\n");

    for (int i = 0; i < questions.length; i++) {
      Question question = questions[i];

      System.out.println("Q." + (i + 1) + " " + question.getQuestion());

      String[] options = question.getOptions();

      for (int j = 0; j < options.length; j++) {
        System.out.println((char) ('A' + j) + ". " + options[j]);
      }

      System.out.print("Answer: ");
      userAnswers[i] = scanner.next().toUpperCase().charAt(0);

      System.out.println();
    }
  }

  public void displayResults() {
    System.out.println("Displaying results...\n");

    int score = 0;

    for (int i = 0; i < questions.length; i++) {
      Question question = questions[i];
      char userAnswer = userAnswers[i];
      char correctAnswer = question.getAnswer();

      System.out.println("Q." + (i + 1) + " " + question.getQuestion());
      System.out.println("Your answer: " + userAnswer);
      System.out.println("Correct answer: " + correctAnswer);

      if (userAnswer == correctAnswer) {
        score++;
        System.out.println("Result: Correct\n");
      } else {
        System.out.println("Result: Incorrect\n");
      }
    }

    System.out.println("Your score: " + score + "/" + questions.length + "\n");
  }

  public void printScore() {
    System.out.println("-- -- -- -- -- -- -- Score-card -- -- -- -- -- -- --\n");
    System.out.println("Question ID | User Answer | Correct Answer | Result");
    for (int i = 0; i < questions.length; i++) {
      Question question = questions[i];
      boolean isCorrect = userAnswers[i] == question.getAnswer();
      String result = isCorrect ? "Correct" : "Incorrect";

      System.out.println(
          question.getId() + " | " +
              userAnswers[i] + " | " +
              question.getAnswer() + " | " +
              result);
    }
  }
}
