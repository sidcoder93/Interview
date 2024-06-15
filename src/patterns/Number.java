package patterns;

public class Number {

    public static void main(String[] args) {


        int n = 14;
        int row = n/2;
        int num=1;

        for(int i=row; i>0; i--){

            for (int j=0; j<i; j++){
                System.out.print(num++);
            }
            System.out.println();
            num=1;
        }

        for (int i=1; i<row; i++){
            num=1;
            for (int j=0; j<=i; j++){

                System.out.print(num++);
            }

            System.out.println();
        }
    }
}
