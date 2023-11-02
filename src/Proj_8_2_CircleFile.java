import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Proj_8_2_CircleFile {
    public static void main(String[] args) {
      ArrayList<Circle>circleList;
      circleList = new ArrayList<>();

      fillArrayList(circleList);
      printCircle(circleList);

    }
    public static void fillArrayList(ArrayList<Circle> circleAl){
       Scanner infile;
       try {
           infile = new Scanner(new File("circle_data.txt"));
           Circle temp;
           double radius;

           while (infile.hasNext()){
               radius = infile.nextDouble();
               temp = new Circle(radius);
               circleAl.add(temp);

           }
           infile.close();
       }
       catch (FileNotFoundException ex){
           System.out.println("Enter accessing file");
       }//end try catch
    }
    public static void printCircle(ArrayList<Circle> circleAL){
        PrintWriter pw;
        try {
           pw = new PrintWriter("circles_output.txt");
           for (Circle c : circleAL){
               System.out.println("Radius is " + c.getRadius());
               System.out.println("Circumference is "+ c.Circumference());
               System.out.println("Area is " + c.area());
               System.out.println();

               pw.println("Radius is " + c.getRadius());
               pw.println("Circumference is "+ c.Circumference());
               pw.println("Area is " + c.area());
               pw.println();
           }
           pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Couldn't find file");
        }
    }
}
