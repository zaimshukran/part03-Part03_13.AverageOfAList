
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;

        while(true){
            int input = Integer.parseInt(scanner.nextLine());

            if(input == -1){
                break;
            }

            list.add(input);
        }

        for(int listItems: list){
            sum += listItems;
            count++;
        }

        System.out.println("Average: " + (1.0*sum/count));
    }
}
