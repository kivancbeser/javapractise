class findAllElementsFromArrayStartsWithOne {
    public static void main(String[] args) {
        //Find element form array who starts with 1
        int[] numbers = {5,9,11,2,8,21,1};
        List<String> stringList = Arrays.stream(numbers).boxed()
                        .map(s->s+"")
                .filter(s->s.startsWith("1"))
                                .collect(Collectors.toList());
        System.out.println(stringList);//Output: [11, 1]
    }
}
