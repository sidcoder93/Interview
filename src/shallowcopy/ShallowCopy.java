package shallowcopy;

public class ShallowCopy implements Cloneable{

    protected int[] data;

    public ShallowCopy(int[] data){
        this.data = data;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
