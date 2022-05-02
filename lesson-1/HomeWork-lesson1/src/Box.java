import java.util.ArrayList;
import java.util.List;

public class Box <F extends Fruit> {
    private List <F> box = new ArrayList<>();
    private Float weight;

    public List<F> getBox() {
        return box;
    }

    public Float getWeightBox(){
        return this.weight;
    }
    public void setBox(F fruit) {
        box.add(fruit);
    }
    public void getWeight(){
        weight=0.0f;
        int count =0;
        for (F f: box) {
            this.weight+=f.getWeight();
            count++;
        }
        System.out.println("Количество фруктов в коробке: "+count+", вес коробки сотставляет: "+this.weight);
    }

    public boolean compare (Box box){
        if(box.weight.equals(getWeightBox())){
            System.out.println("Коробки весят одинаково");
            return true;
        }
        System.out.println("Вес коробок разный");
        return false;
    }
    public void toSprinkle (Box<F> box1){
        for (F f : this.box) {
            box1.setBox(f);
        }
        box.clear();
    }
}

