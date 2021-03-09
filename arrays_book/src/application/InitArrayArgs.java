package application;

public class InitArrayArgs {
    public static void main(String[] args) {
        // verify number of the arguments command row
        if(args.length != 3)
            System.out.printf("Error: Please re-enter the entire command, including%n" +
                              "an array size, initial value and increment.%n");
        else {
            // gets the size of the array from the first command line argument
            int arrayLength = Integer.parseInt((args[0]));
            int[] array = new int[arrayLength];

            // takes the initial value and increments it from the command line arguments
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calculates value each element of the array
            for(int counter=0; counter < array.length; counter++)
                array[counter] = initialValue + increment * counter;

            System.out.printf("%s%8s%n", "Index", "Value");

            // displays the value and the array index
            for(int counter = 0; counter < array.length; counter++)
                System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
}
