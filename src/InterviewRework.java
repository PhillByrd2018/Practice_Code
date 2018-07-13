import java.util.*;
public class InterviewRework {

    //create a string array list
    //feed the string into the list using a for loop
    //use a nested for loop and see if string next to it is larger, if yes then switch

    public List<String> Sort_List_By_Len(List<String> unsort) {

        if (unsort.size() == 0 || unsort.size() == 1) {
            return unsort;

        } else {
            for (int i = 0; i < unsort.size(); i++) {
                for (int g = i +1; g < unsort.size() - 1; g++) {
                    if (unsort.get(i).length() > unsort.get(g).length()) {
                        String temp = unsort.get(g);
                        unsort.set(g,unsort.get(i));
                        unsort.set(i,temp);


                    }
                }
            }
        }


        return unsort;

    }

    public static void main(String[] args) {

        List<String> unsortedList = new ArrayList<String>();
        unsortedList.add("Penguin");
        unsortedList.add("Pie");
        unsortedList.add("Skyfall");
        unsortedList.add("Runner");
        unsortedList.add("Truck");

        InterviewRework test = new InterviewRework();
        System.out.println(test.Sort_List_By_Len(unsortedList));

    }
}
