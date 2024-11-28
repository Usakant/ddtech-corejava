package javaeight;

import java.io.InputStream;
import java.util.*;
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
        //String  words = "dad love my dad";
       // List<String> listOfWords = Arrays.asList(words.split(" "));

        //System.out.println("listOfWords "+ listOfWords);
        String  words = "dad love my dad";
        Arrays.asList(words.split(" ")).stream().filter(w -> w.contentEquals(new StringBuilder(String.valueOf(w)).reverse())).distinct().forEach(System.out::println);
        //System.out.println("Pallidrome "+ palWord.toString());
// write a program reverse a String with preserve  space
        String love = "I love my India";
        System.out.println(new StringBuilder(love).reverse());

        String alphanumeric = "123f34gh345ab2c";
        System.out.println(alphanumeric.replaceAll("[^\\p{Alpha}\\p{Digit}]+"," m."));


    }

}
