//@MoFo

package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {

    private File file;
    private Scanner reader;

    public WordInspection(File file) throws FileNotFoundException {
        this.file = file;
        this.reader = new Scanner(file, "UTF-8");

    }

    public int wordCount() {
        int i = 0;
        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();
            i++;
        }
        return i;
    }

    public List<String> wordsContainingZ() {

        List<String> lst = new ArrayList<String>();

        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();
            if (line.contains("z")) {
                lst.add(line);
            }
        }
        return lst;

    }

    public List<String> wordsEndingInL() {
        List<String> lst = new ArrayList<String>();

        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();
            if (line.endsWith("l")) {
                lst.add(line);
            }
        }
        return lst;

    }

    public List<String> palindromes() {
        List<String> lst = new ArrayList<String>();

        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();
            if (pal(line)) {
                lst.add(line);
            }
        }
        return lst;
    }

    public boolean pal(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> lst = new ArrayList<String>();

        while (this.reader.hasNextLine()) {
            String line = this.reader.nextLine();
            if (vow(line)) {
                lst.add(line);
            }
        }
        return lst;
    }

    public boolean vow(String str) {

        if (str.contains("a")) {
            if (str.contains("e")) {
                if (str.contains("i")) {
                    if (str.contains("o")) {
                        if (str.contains("u")) {
                            if (str.contains("y")) {
                                if (str.contains("ä")) {
                                    if (str.contains("ö")) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

}
