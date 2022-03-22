import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Master branch");
        System.out.println("vtornik_15 branch");

        System.out.println(generateRandomNNumbersLessThenM(10, 100));

        System.out.println(sumOfFirstNEvenNumbers(100));
    }

    public static List<Integer> generateRandomNNumbersLessThenM(int n, int m) {
        Random random = new Random();
        return random.ints(n, 0, m).boxed().collect(Collectors.toList());
    }

    public static List<Integer> generateFirstNNumber(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        return list;
    }

    public static int sumOfFirstNEvenNumbers(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
