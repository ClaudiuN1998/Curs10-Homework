package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class ObjectFromFile {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("files", "grades.csv"));
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            StudentGrade p = new StudentGrade(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            System.out.println(p);
        }
        }
//
}

