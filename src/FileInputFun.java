import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.sum;

public class FileInputFun {
    public static void main(String[] args) {
        Scanner infile;

        try {
            infile = new Scanner( new File("input.txt"));
            int input;
            int sum = 0;

            while (infile.hasNext()){
                input = infile.nextInt();
                System.out.println(input);
                sum +=input;
            }
            System.out.println("sum is " + sum);
            infile.close();

        }
        catch (FileNotFoundException ex){
            System.out.println("Cant find file");
            System.out.println(ex.getMessage());

        }
        catch (InputMismatchException ex){
            System.out.println("Error reading input");


        }
    }//end main

    private static int sum(int input) {
        return input;
    }

    private static class input {
    }
}
