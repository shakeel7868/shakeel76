package Tutorial3;

import java.sql.SQLOutput;

public class Q4_ReferenceCopyExample {
    public static void main(String[] args){
        Q4_Cat c1 = new Q4_Cat("Gray");

        Q4_Mutator mutator = new Q4_Mutator();
        mutator.mutate(c1);
        System.out.println("\nAfter mutate() is called, colour of cat c1 is : " + c1.getColour());

        Q4_Cat c2 = new Q4_Cat("Black");
        System.out.println("After creation of Q4_Cat4 c2");
        System.out.println("Memory address of object c1 is : " + c1);
        System.out.println("Memory address of object c2 is : " + c2);

        System.out.println();

        c2 = c1;
        System.out.println("After assignment of c2 = c1 ");
        System.out.println("Memory address of object c1 is : " + c1);
        System.out.println("Memory address of object c2 is : " + c2);

        c2.setColour("Yellow");

        System.out.println("\n\nAfter c2.setColour(\"Yellow\")");
        System.out.println("Colour of c1 is : " + c1.getColour());
        System.out.println("Colour of c2 is : " + c2.getColour());

        Q4_Cat c3 = c1.create();
        System.out.println("Address of c3 is : " + c3);
    }
}
