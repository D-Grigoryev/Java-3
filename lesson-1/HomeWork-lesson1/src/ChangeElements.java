import java.util.*;

public class ChangeElements <T>{
private T[]array;
   List<T> arrayList = new ArrayList<>();

    public void ChangeArr(T[]array, int index1, int index2){
       T temp= array[index1];
       array[index1]=array[index2];
       array[index2]= temp;
        }

        public List<T> convertToArrayList (T[]array){
             Collections.addAll(arrayList, array);
             return arrayList;
        }
}


