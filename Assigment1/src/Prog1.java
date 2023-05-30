
public class Prog1 {
    public static void main(String[] args) {
        int x = RandomNumbers.getRandomInt(1,9);
        int y = RandomNumbers.getRandomInt(3, 14);

        System.out.println("x is "+x+" result is "+calcPi(x));
        System.out.println("y is "+y+" result is "+calcY(y));
    }

    public static double calcPi(int x){
        return Math.pow(Math.PI, x);
    }
    public static double calcY(int y){
        return Math.pow(y, Math.PI);
    }
}
