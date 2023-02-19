package bai16.ex1;

import java.io.*;
import java.util.ArrayList;

public class CopyFileText {
    public static final String BLANK = "";

    public static ArrayList<String> readFromFile(String path) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals(BLANK)) {
                    continue;
                }
                list.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    return list;
    }
    public static void writeToFile(String path,ArrayList<String> strings){
        try ( BufferedWriter writer= new BufferedWriter(new FileWriter(path))){
            for(String str :strings) {
                writer.write(str);
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> strings=readFromFile("D:\\CODEGYM\\module2\\module2\\src\\bai16\\ex1\\dauvao");
        writeToFile("D:\\CODEGYM\\module2\\module2\\src\\bai16\\ex1\\copy.txt",strings);
    }
}
