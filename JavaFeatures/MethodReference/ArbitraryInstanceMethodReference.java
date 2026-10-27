import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArbitraryInstanceMethodReference {
    public static void main(String[] args) {
        List<String> customersNames = Arrays.asList("amit kale", "ajinkya temak", "Ravi Shinde", "aditya more",
                "siddhi ranaware", "rohit salunke");

        Function<String, String> normalizeName = String::toUpperCase;

        List<String> normalizedNames = customersNames.stream()
                .map(normalizeName)
                .collect(Collectors.toList());

        System.out.println("Original Names : " + customersNames);
        System.out.println("Normalized Names : " + normalizedNames);

        Function<String, String> lambdaNames = name -> name.toUpperCase();

        System.out.println("Lambda : " + lambdaNames.apply("ajju"));
    }
}
