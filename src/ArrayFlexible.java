import java.util.Arrays;

public class ArrayFlexible {
    private int[] arr;
    private int count;

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayFlexible() {
        this.arr = new int[10];
        this.count = 0;
    }

    @Override
    public String toString() {
        return "ArrayFlexible{" +
                "arr=" + Arrays.toString(arr) +
                ", count=" + count +
                '}';
    }

    public void add(int n) {
        if (count >= arr.length) {
            int[] newArr = new int[arr.length + 10];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            this.arr = newArr;
            this.arr[count] = n;
            count++;
        } else {
            this.arr[count] = n;
            count++;
        }
    }
    public void remove(int index){

    }
}
