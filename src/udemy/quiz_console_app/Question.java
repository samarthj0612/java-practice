package udemy.quiz_console_app;

import java.util.Arrays;

public class Question {
  private int id;
  private String question;
  private String options[];
  private char answer;

  public Question(int id, String question, String[] options, char answer) {
    this.id = id;
    this.question = question;
    this.options = options;
    this.answer = answer;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String[] getOptions() {
    return options;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }

  public char getAnswer() {
    return answer;
  }

  public void setAnswer(char answer) {
    this.answer = answer;
  }

  @Override
  public String toString() {
    return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
        + answer + "]";
  }
}
