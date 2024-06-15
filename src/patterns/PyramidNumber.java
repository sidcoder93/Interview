package patterns;

public class PyramidNumber {

    public static void main(String[] args) {

        int n = 8;
        int num= 0;
        for(int i=0; i<n; i++){

            //spaces
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++){
                System.out.print(++num +" " );
            }
            num=0;

            System.out.println();
        }
    }
}
