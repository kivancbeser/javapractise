class countOccurenceEachCharacter {
    public static void main(String[] args) {
        String input = "kivancenes";
        Map<String, Long> map = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
        //Output:{a=1, s=1, c=1, e=2, v=1, i=1, k=1, n=2}
    }
}
