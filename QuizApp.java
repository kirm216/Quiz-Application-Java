public class QuizApp {
    public static void main(String[] args) {
        
        Question q1 = new Question(
            "What is the size of int in Java?",
            new String[]{"2 bytes", "4 bytes", "8 bytes"},
            2
        );

        Question q2 = new Question(
            "Which OOP concept involves reuse of code?",
            new String[]{"Abstraction", "Encapsulation", "Inheritance"},
            3
        );

        Question q3 = new Question(
            "Which keyword is used to create an object?",
            new String[]{"class", "new", "this"},
            2
        );

        Question[] questions = { q1, q2, q3 };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
