import java.io.File;

public class FileDemo {

    public static void main(String[] args) {

        File neueDatei = new File("C:\\Users\\mtf\\OneDrive - CAMPUS 02 Fachhochschule der Wirtschaft GmbH\\Documents\\_Screenshots");

        printAndGetSize(neueDatei);


    }

    public static int printAndGetSize(File f) {
        int temp = 0;
        for (File file : f.listFiles()) {
            System.out.println("File " + file.toString());
            System.out.println("Größe " + file.length());
            temp = Math.toIntExact(temp + file.length());
        }
        System.out.println("Gesamtgröße = " + temp);
        return temp;

        }

    }

