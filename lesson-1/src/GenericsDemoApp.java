public class GenericsDemoApp {
    public static void main(String[] args) {
        TestGeneric<String> genStr = new TestGeneric<>("Hello");
        genStr.showType();
        System.out.println("genSTR.getObj: " +genStr.getObj());
        TestGeneric<Integer> genInt = new TestGeneric<>(140);
        genInt.showType();
        System.out.println("genInt.getObject(): " + genInt.getObj());
        int valueFormGenInt = genInt.getObj();
        String valueFormGenString = genStr.getObj();
//        System.out.println(valueFormGenInt);
//        System.out.println(valueFormGenString);
    }
}
