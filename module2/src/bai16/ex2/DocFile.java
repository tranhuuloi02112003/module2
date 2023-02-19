package bai16.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFile {
    public static List<Country> readToFile(String path){
        List<Country> list= new ArrayList<>();
        try (BufferedReader reader= new BufferedReader(new FileReader(path))){
            String line= null;
            while ((line=reader.readLine())!=null){
                if (line.trim().equals("")){
                    continue;
                }
                String []temp=line.split(",");
                list.add(new Country(temp[0],temp[1],temp[2]));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Country> countryList= readToFile("D:\\CODEGYM\\module2\\module2\\src\\bai16\\ex2\\danhsach");
        countryList.forEach(System.out::println);
    }
}
