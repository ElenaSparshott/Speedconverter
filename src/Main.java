public class Main {

    public static void main(String[] args) {

        for(int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println(calculateInterest(10000.0, 2.0));

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount *(interestRate / 100));
    }


}



