class countOccurenceEachCharacter {
    public static void main(String[] args) {
       //Skip limit method use case based example
        //Skip limit example (2-9)
        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);
        /*Output:
        2
        3
        4
        5
        6
        7
        8
        9*/
    }
}


