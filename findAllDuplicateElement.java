class countOccurenceEachCharacter {
    public static void main(String[] args) {
        String input = "kivancenes";
        List<String> duplicateElements = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(x->x.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateElements);
      //Output: [e, n]
    }
}
