import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {
    public static void main(String[] args) {

        try{
            PrintWriter pw = new PrintWriter("input.txt");
            pw.println("Hey doc");
            pw.println("My name is Debby");
            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldnt write to the file");
        }
    }
}
