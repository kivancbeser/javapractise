class exampleStringJoin {
    public static void main(String[] args) {
         //String.join method example - append
        List<String> nos = Arrays.asList("1", "2", "3", "4");
        String results = String.join("-", nos);
        System.out.println(results);//Output: 1-2-3-4
    }
}
