
package Quee;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereder {
    public static void main(String[] args) {
        FileReader file = null;
        BufferedReader buff = null;
        String st = "";
        try {
            file = new FileReader("C:\\Users\\opuah\\IdeaProjects\\Java_ONline\\useofQue\\src\\Quee\\new.txt");
            buff = new BufferedReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while ( (st =buff.readLine()) != null) {
                System.out.println(st);

            }


        } catch (IIOException e) {
            e.printStackTrace();

        } finally {
            if (file != null) {
                file = null;

            }
            if (buff != null) ;
            {
                buff = null;

            }


        }
    }
}




