public class StstsDemoApp {
    public static void main(String[] args) {
        Stats<Integer> intStats = new Stats<>(1,2,3,4,5);
        System.out.println("Среднее значение IntStats равно: "+intStats.avg());
        Stats<Double> doubleStats = new Stats<>(1.0,2.0,3.0,4.0,5.0);
        System.out.println("Среднее значение doubleStats равно: "
                +doubleStats.avg());
        if(intStats.sameAvg(doubleStats)){
            System.out.println("Средние значения равны");
        }else {
            System.out.println("Средние значения не равны");
        }

    }
}
