package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Quiz {

	private Collection<Question> questions = new ArrayList<Question>();

	public void addQuestion(Question question) {
		questions.add(question);
	}

	public void run() {
		Scanner scanner = new Scanner(System.in);
		for (Question question : questions) {
			question.askQuestion(System.out);
			while (scanner.hasNextLine()) {
				String answer = scanner.nextLine();
				if (question.checkAnswer(answer)) {
					break;
				}
				System.out.println("Feil, pr�v igjen!");
				question.askQuestion(System.out);
			}
		}
		scanner.close();
	}

	public void init() {
		addQuestion(new Question("Hva heter hovedstaden i Norge?", "Oslo"));
		addQuestion(new Question("Hva slags ost er m�nen laget av?",
				"Roquefort", "Camembert", "Roquefort", "Brie"));
		addQuestion(new Question("Hvor h�y er Galdh�piggen?", "2469", "2469",
				"2471"));
		addQuestion(new Question("Er Java g�y?", "ja"));
	}

	public static void main(String[] args) {
		Quiz quiz = new Quiz();
		quiz.init();
		quiz.run();
	}

}
