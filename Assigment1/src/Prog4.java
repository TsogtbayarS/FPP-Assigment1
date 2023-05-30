public class Prog4 {
    public static void main(String[] args) {
        float num1 = 1.27F;
        float num2 = 3.881F;
        float num3 = 9.6F;

        float sum = (num1+num2+num3);
        int sumInt = (int) sum;
        int rounded = Math.round(sum);

        System.out.println(sum);
        System.out.println(sumInt);
        System.out.println(rounded);
    }
}
