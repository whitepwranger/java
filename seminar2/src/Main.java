import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        FileWriter fw = null;
        try {
            fw = new FileWriter("outdata.txt");
            FileReader fr = null;
            fr = new FileReader("jsondata.txt");
            Scanner scan = new Scanner(fr);

            String jsonstr =  scan.nextLine().replace('{','}');
            jsonstr = jsonstr.substring(1,jsonstr.length() - 2);
            String[] jsonObjects = jsonstr.split("}");
            String[] fildObj;
            StringBuilder outStr = new StringBuilder();
            for (int i = 1; i < jsonObjects.length; i+= 2) {
                fildObj = jsonObjects[i].strip().split("\"");
                outStr.append("Студент ");
                outStr.append(fildObj[3]);
                outStr.append(" получил(а) ");
                outStr.append(fildObj[7]);
                outStr.append(" по предмету ");
                outStr.append(fildObj[11]);
                System.out.println(outStr);
                outStr.append("\n");
                fw.write(outStr.toString());
                outStr = new StringBuilder();
            }
            fw.close();
        } catch (IOException e) {;
            throw new RuntimeException(e);
        }
    }
}