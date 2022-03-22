import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Master branch");
        System.out.println("vtornik_15 branch");

        System.out.println(generateRandomNNumbersLessThenM(10,100));
    }

    public static List<Integer> generateRandomNNumbersLessThenM (int n, int m) {
        Random random = new Random();
        return random.ints(n, 0, m).boxed().collect(Collectors.toList());
    }

    public static List<Integer> generateFirstNNumber (int n) {
        List<Integer> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(i);
        }
        return list;
    }
}
