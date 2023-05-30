import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        int[] a = {5, 6, -4, 3, 1};
        int[] b = {3, 8, 9, 11};
        System.out.println(Arrays.toString(combine(a,b)));

    }
    public static int[] combine(int[] a, int[] b){
        int aSize = a.length;
        int bSize = b.length;
        int[] returnArray = new int[aSize+bSize];
        System.arraycopy(a, 0, returnArray, 0 , aSize);
        System.arraycopy(b, 0, returnArray, aSize, bSize);
        return returnArray;
    }
}
