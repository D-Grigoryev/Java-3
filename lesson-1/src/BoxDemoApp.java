public class BoxDemoApp {
    public static void main(String[] args) {
        SimpleBox inBox1 = new SimpleBox(20);
        SimpleBox inBox2 = new SimpleBox(30);

        if(inBox1.getObj() instanceof Integer &&
                inBox2.getObj() instanceof Integer) {

            int sum = (Integer) inBox1.getObj()+(Integer) inBox2.getObj();
            System.out.println("sum = "+sum);
        } else {
            System.out.println("Содержимое коробок отличается по типу");
        }

        inBox1.setObj("Java");

        int secondSum = (Integer) inBox1.getObj()+(Integer) inBox2.getObj();
        System.out.println(secondSum);
    }
}
