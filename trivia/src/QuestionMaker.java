import java.util.LinkedList;

/**
 * Created by benwu on 14-5-28.
 */
public class QuestionMaker {
    public static final int MAX_NUMBER_OF_QUESTIONS = 50;
    private LinkedList<String> popQuestions = new LinkedList<String>();
    private LinkedList<String> scienceQuestions = new LinkedList<String>();
    private LinkedList<String> sportsQuestions = new LinkedList<String>();
    private LinkedList<String> rockQuestions = new LinkedList<String>();

    public QuestionMaker() {
        for (int i = 0; i < MAX_NUMBER_OF_QUESTIONS; i++) {
            addPopQuestion("Pop Question " + i);
            addScienceQuestion(("Science Question " + i));
            addSportsQuestion(("Sports Question " + i));
            addRockQuestion("Rock Question " + i);
        }
    }

    public void addPopQuestion(String popQuestion) {
        popQuestions.add(popQuestion);
    }

    public void addScienceQuestion(String scienceQuestion) {
        scienceQuestions.add(scienceQuestion);
    }

    public void addSportsQuestion(String sportsQuestion) {
        sportsQuestions.add(sportsQuestion);
    }

    public void addRockQuestion(String rockQuestion) {
        rockQuestions.add(rockQuestion);
    }

    public String removeFirstPopQuestion() {
        return popQuestions.removeFirst();
    }

    public String removeFirstScienceQuestion() {
        return scienceQuestions.removeFirst();
    }

    public String removeFirstSportsQuestion() {
        return sportsQuestions.removeFirst();
    }

    public String removeFirstRockQuestion() {
        return rockQuestions.removeFirst();
    }

}
