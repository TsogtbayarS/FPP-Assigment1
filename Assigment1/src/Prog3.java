import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog3 {
    public static void main(String[] args) {
        String[] animals = {"horse", "dog", "cat", "horse", "dog"};

        List<String> resultList = new ArrayList<>();
        for (String animal : animals){
            if (!resultList.contains(animal)) {
                resultList.add(animal);
            }
        }
        String[] result = resultList.toArray(new String[0]);
        System.out.println(Arrays.toString(result));
    }
}
