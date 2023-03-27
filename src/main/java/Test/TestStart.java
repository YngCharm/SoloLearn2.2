package Test;

import Questions.QuestionGenerate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestStart {

    QuestionGenerate questionGenerate = new QuestionGenerate();

    Scanner scanner = new Scanner(System.in);
    int countCorrectAnswer = 0;

    public TestStart() throws IOException {
    }

    public void chooseQuestion() throws IOException {

        for (int i = 0; i < 10; i++) {

            questionGenerate.showQuestion(i);
            System.out.println("Введите ответ цифрами от 1 до 4");
            int inputAnswer = scanner.nextInt();
            questionGenerate.writer.write(inputAnswer);

            if (inputAnswer == questionGenerate.correctAnswer) {
                countCorrectAnswer++;
            }
        }
        System.out.println("Вы ответили на " + countCorrectAnswer * 10 + " % вопросов.");
        questionGenerate.writer.write("Вы ответили на " + countCorrectAnswer * 10 + " % вопросов.");
        questionGenerate.writer.close();
    }
}
