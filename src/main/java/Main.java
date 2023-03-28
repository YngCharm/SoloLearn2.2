
import Questions.QuestionGenerate;
import Test.TestStart;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TestStart testStart = new TestStart();
        QuestionGenerate questionGenerate = new QuestionGenerate();
        questionGenerate.generatorNumbers();
        testStart.chooseQuestion();
    }
}
