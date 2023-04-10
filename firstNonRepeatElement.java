class countOccurenceEachCharacter {
    public static void main(String[] args) {
        String input = "kivancenes";
        String firstNonRepeatElement = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                        .entrySet()
                                .stream()
                                        .filter(x->x.getValue()==1)
                                                .findFirst().get().getKey();
        System.out.println(firstNonRepeatElement);
       //Output: k
    }
}
