package hashtable;

import java.util.HashMap;

public class item_In_Common{
    public static boolean itemInCommon(int[] array1, int[] array2){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for(int i :array1){
            myHashMap.put(i, true);
        }
        for(int j :array2){
            if(myHashMap.get(j) != null) return true;
        }
        return false;
    }

    public static void main(String[] args){
        int[] array1 = {1,2,3,5};
        int[] array2 = {4,5,6};

        System.out.println(itemInCommon(array1, array2));
    }
}