Задание 1
BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
System.out.println(sum.apply(5, 3));

Задание 2
Function<String, String> toUpper = s -> s.toUpperCase();
System.out.println(toUpper.apply("hello"));

Задание 3
List<Integer> list = Arrays.asList(1,2,3,4,5);
list.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

Задание 4
        list.stream().map(n -> n * n).forEach(System.out::println);

Задание 5
int max = list.stream().max(Integer::compare).orElse(0);
System.out.println(max);

Задание 6
List<String> words = Arrays.asList("java", "stream", "api");
words.stream()
    .sorted((a,b) -> a.length() - b.length())
        .forEach(System.out::println);

Задание 7
        words.stream()
    .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
        .forEach(System.out::println);

Задание 8
        words.stream()
    .filter(s -> s.length() > 5)
        .forEach(System.out::println);

Задание 9
        list.forEach(System.out::println);

Задание 10
int min = list.stream().min(Integer::compare).orElse(0);
System.out.println(min);

Задание 11
Consumer<String> printer = s -> System.out.println(s);
printer.accept("Привет");

Задание 12
Supplier<Integer> random = () -> new Random().nextInt(100);
System.out.println(random.get());

Задание 13
        students.stream()
    .sorted(Comparator.comparing(s -> s.age))
        .forEach(System.out::println);

Задание 14
        students.stream()
    .filter(s -> s.grade > 80)
        .sorted(Comparator.comparing(s -> s.name))
        .forEach(System.out::println);

Задание 15
        list.stream()
    .filter(n -> n > 3)
        .map(n -> n * 2)
        .sorted()
    .forEach(System.out::println);

Задание 16
Map<Integer, List<Student>> grouped =
        students.stream().collect(Collectors.groupingBy(s -> s.age));

Задание 17
int sum = list.stream().reduce(0, Integer::sum);
System.out.println(sum);

Задание 18
        list.stream()
    .distinct()
    .limit(3)
    .forEach(System.out::println);

Задание 19
List<List<Integer>> listOfLists = Arrays.asList(
        Arrays.asList(1,2),
        Arrays.asList(3,4)
);

listOfLists.stream()
    .flatMap(List::stream)
    .forEach(System.out::println);

Задание 20
List<Integer> orders = Arrays.asList(500,1500,2000,300);

orders.stream()
    .filter(o -> o > 1000)
        .sorted()
    .forEach(System.out::println);