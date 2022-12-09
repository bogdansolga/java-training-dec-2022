package d05.s03;

import domain.Product;
import domain.Section;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamsMain {

    private static final List<String> STRINGS = Arrays.asList("I want a holiday, not just a weekend".split(" "));

    public static void main(String[] args) {
        //simpleOperations();

        //matchOperations();

        //findOperations();

        //loopFusion();

        //mapReduce();

        //flatMapping();

        //parallelStreams();

        mapOperations();
    }

    private static void simpleOperations() {
        final long count = STRINGS.stream()
                                  .filter(word -> word.length() > 3)
                                  .count();
        System.out.println("There are " + count + " words longer than 3 chars");

        final List<String> collect = STRINGS.stream()
                                            .filter(item -> item.length() < 3)
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Collected words: " + collect);

        final Stream<String> stringStream = STRINGS.stream()
                                                   .filter(item -> item.length() > 5);
        System.out.println(stringStream.collect(Collectors.toList())); // we need a terminal operation for the stream to be processed
    }

    private static void matchOperations() {
        final boolean anyMatch = STRINGS.stream()
                                        .anyMatch(item -> item.length() > 5);
        System.out.println("The list has a word longer than 5 chars - " + anyMatch);

        final boolean allAreNotEmpty = STRINGS.stream()
                                              .allMatch(item -> !item.isEmpty());
        System.out.println("All words are not empty - " + allAreNotEmpty);

        final boolean noneIsEmpty = STRINGS.stream()
                                           .noneMatch(String::isEmpty);
        System.out.println("None is empty - " + noneIsEmpty);
    }

    private static void findOperations() {
        final Optional<String> first = STRINGS.stream()
                                              .filter(item -> item.length() > 5)
                                              .findFirst();
        first.ifPresent(item -> System.out.println("The item is " + item));

        final Optional<String> optional = STRINGS.stream()
                                                 .filter(item -> item.isEmpty())
                                                 .findAny();
        optional.ifPresent(item -> System.out.println("The item is " + item));
    }

    private static void loopFusion() {
        // streams API goodies :-)
        final int value = STRINGS.stream()
                                 .peek(it -> System.out.println("[s] " + it))
                                 .filter(item -> item.length() > 4)
                                 .peek(it -> System.out.println("[f] " + it))
                                 .map(String::length)
                                 .peek(it -> System.out.println("[m] " + it))
                                 .findFirst()
                                 .orElse(0);
        System.out.println("The value is " + value);
    }

    private static void mapReduce() {
        final Set<String> collect = STRINGS.stream()
                                           .filter(item -> item.length() > 5)
                                           .map(item -> item.toLowerCase()) // map
                                           .collect(Collectors.toSet()); // reduce
        System.out.println(collect);

        final String collected = STRINGS.stream()
                                        .filter(item -> item.length() > 3)
                                        .collect(Collectors.joining(" "));
        System.out.println(collected);

        final OptionalInt max = STRINGS.stream()
                                       .filter(item -> item.length() > 3)
                                       .mapToInt(item -> item.length())
                                       .max();
        max.ifPresent(item -> System.out.println("The max is " + item));
    }

    private static void flatMapping() {
        Set<Section> sections = Set.of(new Section(1, "Phones"), new Section(2, "Tablets"));
        final Set<Product> products = sections.stream()
                                              .flatMap(item -> item.getProducts().stream())
                                              .collect(Collectors.toSet());
        System.out.println("There are " + products.size() + " products in the two sections");
    }

    private static void parallelStreams() {
        final Set<String> collect = STRINGS.parallelStream()
                                           .filter(item -> item.length() > 3)
                                           .map(item -> "[" + Thread.currentThread().getName() + "] " + item)
                                           .collect(Collectors.toSet());
        collect.forEach(item -> System.out.println(item));

        final Stream<String> stream = StreamSupport.stream(STRINGS.spliterator(), STRINGS.size() > 100);
        System.out.println(stream.count());
    }

    private static void mapOperations() {
        Map<Integer, String> weekDays = Map.of(1, "Monday", 2, "Tuesday");
        weekDays.keySet().stream();
        weekDays.values().stream();
        weekDays.entrySet().stream();
    }
}
