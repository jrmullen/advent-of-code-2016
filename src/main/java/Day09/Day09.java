package Day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by jmullen on 12/19/16.
 */

public class Day09 {

    public static void main(String[] args) throws FileNotFoundException {

        String compressed = "";
        Scanner scanner = new Scanner(new File("src\\main\\java\\Day09\\input9.txt"));
        while (scanner.hasNext()) {
            compressed += scanner.next();
        }

        System.out.println(compressed); //remove

        String decompressedString = "";
        int repeatStringLength = 0;
        int repeatNumber = 0;

        for (int i = 0; i < compressed.length(); i++) {

            String tempStr = "";
            int tempInt = i;
            boolean bool = false;

            if (compressed.charAt(i) == '(') {
                while (!bool) {
                    if (compressed.charAt(tempInt) == 'x') {
                        bool = true;
                    } else if (compressed.charAt(tempInt) != '(') {
                        tempStr += compressed.charAt(tempInt);
                    }
                    tempInt++;
                }
//                repeatStringLength = Iteger;

                tempStr = "";
                tempInt = 0;
                bool = false;
            }

            if (compressed.charAt(i) == 'x') {
                while (!bool) {
                    if (compressed.charAt(tempInt) == ')') {
                        bool = true;
                    } else {
                        tempStr += compressed.charAt(tempInt);
                    }
                    tempInt++;
                }
                repeatNumber = Integer.getInteger(tempStr);

                tempStr = "";
                tempInt = 0;
                bool = false;
            }

            System.out.println("String length " + repeatStringLength + " repeat " + repeatNumber);
        }


    }
}
