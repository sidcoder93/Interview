package patterns;

public class NumberPattern1 {

    public static void main(String[] args) {


        int row = 7;
        int num=1;

        for(int i=0; i<row; i++) {
            num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num++);
            }

            System.out.println();
        }

        for (int i=row-1; i>0; i--){
            num=1;
            for(int j=0; j<i; j++){

                System.out.print(num++);
            }

            System.out.println();

        }
    }
}
