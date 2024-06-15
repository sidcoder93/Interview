package patterns;

import java.awt.font.FontRenderContext;

public class PyramidAlphabets {

    public static void main(String[] args) {

        int row = 7;

        char c = 'A';
        for(int i=0; i<row; i++){

            for (int j=0; j<row-i-1; j++){

                System.out.print(" ");

            }

            for(int j=0; j<=i; j++){

                System.out.print(c++ + " ");
            }

            System.out.println();

            c = 'A';


        }
    }
}
