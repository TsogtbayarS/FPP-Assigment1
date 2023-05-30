public class Prog6 {
    public static void main(String[] args) {
        int[] array = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println(min(array));
    }

    static int min(int[] arrayOfInts) {
        int min = arrayOfInts[0];
        for (int x : arrayOfInts) {
            if(min>x)
                min=x;
        }
        return min;
    }
}
