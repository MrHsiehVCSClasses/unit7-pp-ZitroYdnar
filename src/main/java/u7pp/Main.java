package u7pp;
import java.util.List;
import java.util.ArrayList;

public class Main 
{
    public static void main( String[] args ) {
        System.out.println ("If you are seeing this, you have just run the main function.\n"
        + "Use this to debug while you create your sorts & game :)\n");

        // uncomment the following lines to run your war program
        ArrayList<Integer> p = new ArrayList<Integer>();
      p.add(20);
      p.add(-60);
      p.add(1);
p.add(10);
      p.add(6);
      p.add(-2);
      System.out.print(Sorts.selectionSort(p));
      
    }
}
