import java.util.TreeSet;

public class TreeSetExp {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();
        TreeSet<String> treeSet2 = new TreeSet<>();
        // Elements are added using add() method
        treeSet1.add("D");
        treeSet1.add("J");
        treeSet1.add("E");
        treeSet1.add("B");
        treeSet1.add("S");
        treeSet1.add("L");
        treeSet1.add("M");
        treeSet1.add("H");
        treeSet1.add("R");
        treeSet1.add("W");

        // Elements are added using add() method
        treeSet2.add("Q");
        treeSet2.add("O");
        treeSet2.add("J");
        treeSet2.add("T");
        treeSet2.add("H");
        treeSet2.add("E");
        treeSet2.add("V");
        treeSet2.add("A");
        treeSet2.add("L");
        treeSet2.add("P");
        //Showing the elements of both treeSets
        System.out.println(treeSet1);
        System.out.println(treeSet2);
    }
}
