import org.w3c.dom.css.Rect;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectanglelist;
        rectanglelist = new ArrayList<>();

        fillArrayList(rectanglelist);
        printRectangles(rectanglelist);


    }//end main
    public static void fillArrayList(ArrayList<Rectangle> rectangleAL){
        Scanner infile;
        try {
         infile = new Scanner( new File("rectangle.txt"));
         Rectangle temp;
         double lenght;
         double width;

         while (infile.hasNext()){
             lenght = infile.nextDouble();
             width = infile.nextDouble();
             temp = new Rectangle(lenght, width);
             rectangleAL.add(temp);//add new component to its list
         }//end while
         infile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("Error accessing file!");
        }
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleAl){
        for (Rectangle r : rectangleAl){
            System.out.println("length is " + r.getLength());
            System.out.println("width is " + r.getWidth());
            System.out.println("Area is " + r.area());
            System.out.println("Perimeter is " + r.perimeter());
            System.out.println();
        }
    }

}
