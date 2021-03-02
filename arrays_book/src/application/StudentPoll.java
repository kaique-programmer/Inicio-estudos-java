package application;

import java.util.Scanner;

public class StudentPoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of the student answer (more typically, inserted in execution time)
        int[] responses = new int[20];
        for (int i=1; i < responses.length; i++){
            System.out.print("1-5: ");
            responses[i] = sc.nextInt();
        }
        int[] frequency = new int[6]; // counter array frequency

        /*
         for each answer, select answer element and uses this values as index of the frequency for to determinate
         element the to increment
        */

        for (int answer = 0; answer < responses.length; answer++) {
            try{
                ++frequency[responses[answer]];
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invoke toString method
                System.out.printf("     responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // generates output of the value each array element
        for (int rating =1; rating < frequency.length; rating++)
            System.out.printf("%6d%10d%n", rating, frequency[rating]);

    }
}
