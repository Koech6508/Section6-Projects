import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("manu");
        names.add("Chero");
        names.add("enock");
        names.add("diana");



        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for (String name: names){
                pw.println(name);
            }
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Cant write to file");

        }

    }
}
