package attendence;

public class Main {

    public static void main(String[] args) {

        CustomRegister cr = new CustomRegister();

        int[] attendance = {1,1,1,2,3,4,5,5,6,6,2,2,3,3,3,8,8,8,7,7,7,7,7,9,9,5,5,10,12};

        cr.addAttendence(attendance);

        cr.changeAttendence(4,'P');
        cr.changeAttendence(4, 'P');

        cr.reduceRegister(3);

        cr.personalAttendance(1);

        System.out.println(cr.maxAttendance());


    }
}
