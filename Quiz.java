import java.util.Scanner;

public class Quiz {
    private Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            questions[i].displayQuestion();

            System.out.print("Your answer: ");
            int userAnswer = sc.nextInt();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong.");
            }
        }

        System.out.println("\nQuiz Over!");
        System.out.println("Your Score: " + score + " / " + questions.length);
        sc.close();
    }
}

