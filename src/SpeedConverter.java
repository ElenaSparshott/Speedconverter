public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }else{
            return Math.round(kilometersPerHour/1.609);
        }
    }


    public static void printConversion(double kilometersPerHour){
        long answer = toMilesPerHour(kilometersPerHour);
        if(answer < 0) {
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometersPerHour + " km/h = " + answer + " mi/h" );
        }
    }

}
