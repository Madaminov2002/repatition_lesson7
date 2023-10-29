import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("recourse/exam1.text"));
        os.writeObject("Salom");
        os.close();

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("recourse/exam1.text"));
        Object o = ois.readObject();
        System.out.println("o = " + o);
        ois.close();

    }
}