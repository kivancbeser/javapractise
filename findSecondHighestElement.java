class findSecondHighestElement {
    public static void main(String[] args) {
        //Java program to find second highest number from given array
        int[] numbers = {5, 9,11,2,8,21,1};
        //Sorted array
        List<Integer> integerList = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
        System.out.println(integerList);//Output: [1, 2, 5, 8, 9, 11, 21]

        //ıf you want reverse order
        List<Integer> integerReverseList = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(integerReverseList);//Output: [21, 11, 9, 8, 5, 2, 1]

        //Skip first element
        List<Integer> integerSkipFirstReverseList = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).collect(Collectors.toList());
        System.out.println(integerSkipFirstReverseList);//Output: [11, 9, 8, 5, 2, 1]

        //Return second highest element
        Integer secondHighestElement = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        System.out.println(secondHighestElement);//Output: 2
    }
}
     
