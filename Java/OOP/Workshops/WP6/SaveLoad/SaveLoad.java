package Workshops.WP6.SaveLoad;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveLoad<L> {
    public void save(String path, L obj) throws IOException {
        FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(obj);
        objectOut.close();
    }

    public L load(String path) throws ClassNotFoundException, IOException {
        FileInputStream fileIn = new FileInputStream(path);
        ObjectInputStream objectIn = new ObjectInputStream(fileIn);
        L content = (L) objectIn.readObject();
        objectIn.close();
        return content;
    }
}
