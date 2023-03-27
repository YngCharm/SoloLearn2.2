package Questions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QuestionGenerate {


    public QuestionGenerate() throws IOException {
    }

   public File file = new File("E:\\project java\\SoloLearn2.1-master\\test1.txt");
    public FileWriter writer = new FileWriter(file);

    public ArrayList<Question> getListQuestion() {
        return listQuestion;
    }

    private final ArrayList<Question> listQuestion = new ArrayList<>();

    Question questionFirst = new Question("Назовите единственное чётное число",
            new String[]{"5", "8", "2", "10"}, 3);

    Question questionSecond = new Question("9 * N = 108  Чему равно N?",
            new String[]{"13", "19", "12", "8"}, 3);

    Question questionThird = new Question("Какой единицей является сотая часть метра?",
            new String[]{"Дециметр", "Сантиметр", "Милиметр", "Нанометр"}, 2);

    Question questionFourth = new Question("Сколько градусов в прямом угле?",
            new String[]{"90", "120", "45", "180"}, 1);

    Question questionFifth = new Question("Сколько рёбер у октаэдра?",
            new String[]{"12", "8", "6", "16"}, 1);

    Question questionSixth = new Question("Среднее первых 50 натуральных числе?",
            new String[]{"25", "25,5", "27,5", "24"}, 2);

    Question questionSeventh = new Question("Значение cos 360°?",
            new String[]{"0", "2√3", "1", "1/2"}, 3);

    Question questionEight = new Question("Сумма углов квадрата?",
            new String[]{"270°", "180°", "90°", "360°"}, 4);

    Question questionNinth = new Question("График функции X^3?",
            new String[]{"Гипербола", "Парабола", "Квадратичная", "Логорифмическая"}, 2);

    Question questionTenth = new Question("Чему равна 4^(-1) часа?",
            new String[]{"20мин", "30мин", "15мин", "45мин"}, 3);

    public void addQuestions() {
        listQuestion.add(questionFirst);
        listQuestion.add(questionSecond);
        listQuestion.add(questionThird);
        listQuestion.add(questionFourth);
        listQuestion.add(questionFifth);
        listQuestion.add(questionSixth);
        listQuestion.add(questionSeventh);
        listQuestion.add(questionEight);
        listQuestion.add(questionNinth);
        listQuestion.add(questionTenth);
    }

    public int correctAnswer;


    public void showQuestion(int numberOfQuestion) throws IOException {
        addQuestions();
        Integer[] arr = new Integer[10];


        arr[numberOfQuestion] = numberOfQuestion;
        Collections.shuffle(Arrays.asList(arr));

        System.out.println(listQuestion.get(numberOfQuestion).question + "\n"
                + Arrays.toString(listQuestion.get(numberOfQuestion).answer));

        writer.write(listQuestion.get(numberOfQuestion).question + "\n"
                + (Arrays.toString(listQuestion.get(numberOfQuestion).answer)) + "\n");

        correctAnswer = listQuestion.get(numberOfQuestion).correctAnswer;
    }
}
