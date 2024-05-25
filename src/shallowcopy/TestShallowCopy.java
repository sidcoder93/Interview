package shallowcopy;

public class TestShallowCopy {

    public static void main(String[] args) throws CloneNotSupportedException {


        int [] num = {1,2,3,4,5};

        ShallowCopy original = new ShallowCopy(num);

        //------- creating shallow copy using clone method ------
        ShallowCopy copy = (ShallowCopy) original.clone();

        System.out.println(original==copy);
        System.out.println(original.data == copy.data);
    }
}
