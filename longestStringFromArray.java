class longestStringFromArray {
    //Find the longest string from given array
    public static void main(String[] args) {
        String[] strArray = {"java","techie","springboot","microservices","kivanc"};

        String longestString = Arrays.stream(strArray)
                        .reduce((word1,word2)-> word1.length()>word2.length()?word1:word2)
                                .get();
        System.out.println(longestString);//Output: microservices
    }
}
