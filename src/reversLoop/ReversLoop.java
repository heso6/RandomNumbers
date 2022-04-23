package reversLoop;

public class ReversLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversed = new int[10];

//        for (int i = numbers.length; i > 0; i--) {
//
//            reversed[i] = i;
//
//            System.out.println(reversed[i]);
//        }
            for (int i = 1; i <= numbers.length; i++) {
                reversed[i - 1] = numbers[numbers.length - i];
            }



        for (int number : reversed){
            System.out.println(number);
        }

        int gitHubTest = 34;

    }
}

