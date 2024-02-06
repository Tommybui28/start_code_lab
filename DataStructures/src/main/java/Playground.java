import java.lang.module.FindException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class Playground {

    public static void  main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("banana");
      //  System.out.println(fruits);
        String firstFruit = fruits.get(0);
    //    System.out.println(firstFruit);
        int lengthOfArrayList = fruits.size();
    //    System.out.println(lengthOfArrayList);

        fruits.remove(0);
    //    System.out.println(fruits.get(0));

//        HASHMAP

    //    String[] fruits = {"apple", "banana"};
    //    int[] shelflife = {5, 2};


    //           key     value
        HashMap<String, Integer> shelfLifeOfFruits = new HashMap<>();

        shelfLifeOfFruits.put("apple", 5);
        shelfLifeOfFruits.put("banana", 2);

    //    System.out.println(shelfLifeOfFruits);

        int appleShelfLife = shelfLifeOfFruits.get("apple");
        System.out.println(appleShelfLife);

        System.out.println(shelfLifeOfFruits.keySet());

    //    shelfLifeOfFruits.put("apple", 6);    ----  avoid this. otherwise cannot retrieve original data
        shelfLifeOfFruits.replace("apple", 6);
    //    shelfLifeOfFruits.remove("apple");


        System.out.println(shelfLifeOfFruits);

    }
}
