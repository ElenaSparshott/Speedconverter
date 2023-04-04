public class Prime {

    public static void main(String[] args) {

        int primeNumberCounter = 0;

        for(int number = 0; number <= 50; number++){
            if(isPrime(number)){
                System.out.println(number);
                primeNumberCounter += 1;
                if (primeNumberCounter == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for( int divisor = 2; divisor < wholeNumber; divisor++){
            if(wholeNumber % divisor == 0){
                return false;
            }
        }
        return true;

    }
}
