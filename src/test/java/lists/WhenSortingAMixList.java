package lists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WhenSortingAMixList {

    @Test
    public void sorting_a_mix_list(){

        //the below list needs to be sorted such that the date values are sorted in descending order
        //and the list containing string needs a sorting in natural order
        List<String> mixList = new ArrayList<>();
        mixList.add("A random string 19/07/2021");
        mixList.add("another random string 25/09/2021");
        mixList.add("A list with everything thrown in 03/08/2020");
        mixList.add("Did you know the word sandwich is named for a person");
        mixList.add("Another random list");

    }
}
