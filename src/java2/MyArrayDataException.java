package java2;

public class MyArrayDataException extends Throwable {
    public int k;
    public int l;
    public MyArrayDataException(int k,int l) {
        this.k = k;
        this.l = l;
    }
}
