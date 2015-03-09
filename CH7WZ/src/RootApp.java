
public class RootApp {

    private double targetX = 0;
    private double e = 0;
    private double pGuess = 0;

    public RootApp(double targetX, double e) {
        this.targetX = targetX;
        this.e = e;
        pGuess = targetX / 2;
    }

    public boolean hasMoreGuesses() {
        return Math.abs((pGuess * pGuess) - targetX) > e;
    }

    public double nextGuess() {
        pGuess = (0.5) * (pGuess + targetX / pGuess);
        return pGuess;
    }

}
