package org.fileinput;

import java.io.File;

public class FileInputStream {


    public static void main(String[] args) {

        File file = new File("C:\\Users\\mtf\\OneDrive - CAMPUS 02 Fachhochschule der Wirtschaft GmbH\\Documents\\test.txt\"");

        java.io.FileInputStream fis = new java.io.FileInputStream(file);
        int byteRead = 0;

        while (byteRead = fis.read())

    }
    
    
}
