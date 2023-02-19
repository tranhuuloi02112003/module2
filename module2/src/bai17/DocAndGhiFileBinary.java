package bai17;

import java.io.*;
import java.util.List;

public class DocAndGhiFileBinary {

    public static void writeProdoct(String path, List<Prodoct> list) {
        try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(path))) {
            stream.writeObject(list);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Prodoct> readProdoct(String path) {
        try (ObjectInputStream stream = new ObjectInputStream(new FileInputStream(path))) {
            return (List<Prodoct>) stream.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
