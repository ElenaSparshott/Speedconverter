public class SumChallenge {

    public static int threeFive() {
        int acc = 0;
        int sum = 0;
        for(int i = 0; i <=1000; i++){
            if (i % 15 == 0){
                System.out.println(i);
                sum += i;
                acc += 1;
                if(acc == 5)
                    break;
            }
        }
        System.out.println(sum);
        return acc;
    }

    public static void main(String[] args) {
        threeFive();
    }
}

