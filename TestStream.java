package test;

import java.util.stream.IntStream;

class TestStream {
    public static void main(String[] args) {
        IntStream.concat(
                    IntStream.range(0, 4),
                    IntStream.range(2, 10))
                .distinct()
                .skip(5)
                .limit(3)
                .reduce((a, b) -> a + b)
                .ifPresent(System.out::println);
    }
}
