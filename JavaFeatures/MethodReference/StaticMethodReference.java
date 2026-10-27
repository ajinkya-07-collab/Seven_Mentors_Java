import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StaticMethodReference {

    public static void main(String[] args) {

        List<String> employeeIds = Arrays.asList("101", "102", "103", "104", "105");

        Function<String, Integer> convertId = Integer::parseInt;

        List<Integer> numericIds = employeeIds.stream()
                .map(convertId)
                .collect(Collectors.toList());

        System.out.println("Original IDs: " + employeeIds);
        System.out.println("Original ID type: "
                + employeeIds.get(0).getClass().getSimpleName());

        System.out.println("Numeric IDs: " + numericIds);
        System.out.println("Numeric ID type: "
                + numericIds.get(0).getClass().getSimpleName());

        Function<String, Integer> lambdaConverted = id -> Integer.parseInt(id);

        System.out.println("Converted Single ID(Lambda): " + lambdaConverted.apply("105"));
    }
}