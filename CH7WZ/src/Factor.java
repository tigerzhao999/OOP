
public class Factor {

    double factorial(double x){
        double y = 2;
        double fact;
        for(fact = 1; y <= x; y++){
            fact = y * fact;
            System.out.println(fact);
        }
        return fact;
    }
    public static void main(String[] args) {
        Factor factor = new Factor();
        factor.factorial(30);


    }
}


