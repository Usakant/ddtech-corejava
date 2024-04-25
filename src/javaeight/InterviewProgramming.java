package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class InterviewProgramming {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        //separate odd and even numbers
       // List<Integer> evenNumbers = listOfIntegers.stream().filter(i -> i % 2 == 0).collect(toList());

        Map<Boolean, List<Integer>> evenNumbers = listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even Numbers" + evenNumbers);
        //Remove Duplicate elements from list
        List<Integer> uniqueElements = listOfIntegers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Numbers" + uniqueElements);

    }
}
