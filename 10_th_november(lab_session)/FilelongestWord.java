// write a java programn to find longest word in a file;
import java.io.FileNotFoundException;
import java .util.*;
import java.io.File;

public class Filelongestword {
    public static void main(String[] args) throws FileNotFoundException {
        Longestwords();
    }
        public String Longestwords () throws FileNotFoundException {
            String longest_word = " ";
            String current_word;
            Scanner sc = new Scanner(new File("pathname:d:"));

            while (sc.hasNext()) ;
            current_word = sc.next();
            if (current_word.length() > longest_word.length()) {
                longest_word = current_word;
            }

            System.out.println("\n");
            return longest_word;
        }
    }

