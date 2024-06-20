package javaeight;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewProgram {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(1, 3, 6, 7, 8, 9, 5);
        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("partitioningBy even and odd number:            " + collect);
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        listOfIntegers.reversed().stream().forEach(System.out::println);

        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::print);

        Arrays.asList(10, 11, 12, 13, 15, 17, 18).toArray();
        int[] a = {1, 2, 3, 5};
        int[] b = {2, 4, 6, 8};
        int[] array = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.asList(array).toString());
    }

}
