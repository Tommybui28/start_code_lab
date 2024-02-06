import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {

        List<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("silver");
        colours.add("green");
        colours.add("raspberry red");

//        System.out.println(colours);


//      Enhanced FOR LOOP

        for (String colour: colours) {
     //       System.out.println(colour.toUpperCase());

        }

        List<String> filteredColours = new ArrayList<>();

        for (String colour : colours) {
            if (colour.charAt(0) == 'r') {
                filteredColours.add(colour);

            }
        }
      //  System.out.println(filteredColours);

//      CLASSIC FOR LOOP

        for (int i = 0; i<colours.size(); i++) {
            String colour = colours.get(i);
        //    System.out.println(colour);
        }

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i+=2 ) {
            numbers.add(i);

        }
        System.out.println("numbers:" + numbers);

    //  i = 1, true, i = 3 >>> numbers[1]
    //  i = 3, true, i = 5 >>> numbers[1,3]
    //  .....
    //  i = 11, false


    }
}
