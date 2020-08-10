package homework;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        IntStream.range(0, 10)
//                .forEach(System.out::println);

//        IntStream.rangeClosed(0, 10)
//                .forEach(System.out::println);

        int sum = IntStream.range(0, 10)
                .sum();
        System.out.println(sum);

        double asDouble = IntStream.range(0, 10)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

        int asInt = IntStream.range(0, 10)
                .max()
                .getAsInt();
        System.out.println(asInt);

        int asInt1 = IntStream.range(0, 10)
                .min()
                .getAsInt();
        System.out.println(asInt1);

        IntSummaryStatistics intSummaryStatistics = IntStream.range(0, 10)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);

//        Stream.of(1, 2, 3, 4, 5)
//            .mapToInt()
//            .mapToDouble()
//            .mapToLong();

    }
}
