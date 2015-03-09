/**
 * Created by AHappyTeddyBear on 3/8/2015.
 */
public class HeronsFormula {
    public static void main(String[] args) {
        RootApp approx = new RootApp(10, 0.00000000001);
        while (approx.hasMoreGuesses()){
            System.out.println(approx.nextGuess());
        }

    }
}
