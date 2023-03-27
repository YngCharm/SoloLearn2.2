package Questions;


public class Question {

    public Question(String question, String[] answer, int correctAnswer) {
        this.question = question;
        this.answer = answer;
        this.correctAnswer= correctAnswer;
    }

    String question;

    String[] answer;

    int correctAnswer;
}
