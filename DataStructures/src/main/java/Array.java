public class Array {
    public static void main(String[] args) {
        String fruit1 = "apple";
        String fruit2 = "pear";
        String fruit3 = "strawberry";

    // Array []                0        1           2

        String [] fruits = {"apple", "pear", "strawberry"};

    //    System.out.println(fruits[0]);
        String apple = fruits[0];
        System.out.println(apple);

        fruits[1] = "banana";
        System.out.println(fruits[1]);

        int lengthOfFruitsArray = fruits.length;
        System.out.println(lengthOfFruitsArray);

        fruits[0] = null;

        System.out.println(fruits[0]);

        int[] ageOfTrainers = {12 ,13, 14};

    }
}
