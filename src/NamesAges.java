import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;

        try {
            namesFile = new Scanner(new File("students_names.txt"));
            agesFile = new Scanner(new File("students_ages.txt"));
            pw = new PrintWriter("names_ages.txt");

            String tempName;
            int tempAge;

            while (namesFile.hasNext()){
                tempAge = agesFile.nextInt();
                tempName = namesFile.nextLine();

                pw.println(tempName + " is " + tempAge + " years old");
            }
            namesFile.close();
            agesFile.close();
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());

        }//end of try catch
    }
}
