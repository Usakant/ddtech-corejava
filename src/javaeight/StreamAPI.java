package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamAPI {

    List<Transaction> transactions = Arrays.asList(new Transaction(100),new Transaction(200) ) ;
    // use of filter , map and reduce
    int sumExpensive =
            transactions.stream()
                    .filter(t -> t.getValue() > 100)
                    .map(Transaction::getValue)
                    .reduce(50, Integer::sum);


    Stream<String> words = Stream.of("Java", "Magazine", "is",
            "the", "best");


    Map<String, Long> letterToCount =
            words.map(w -> w.split(""))
                    .flatMap(Arrays::stream)
                    .distinct()
                    .collect(groupingBy(identity(), counting()));

    public static void main(String[] args) {
        StreamAPI obj = new StreamAPI();
        System.out.println("Filter "+obj.sumExpensive);

        System.out.println("---------------");
        System.out.println("flatmap "+obj.letterToCount);
    }
}
