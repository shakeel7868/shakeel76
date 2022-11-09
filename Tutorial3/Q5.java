package Tutorial3;

public class Q5 {
    public static void main(String[] args){
        String h1 = new String("cat");
        String h2 = new String("cat");
        String g1 = "cat";
        String g2 = "cat";


        MyInteger m1 = new MyInteger(11);
        MyInteger m2 = new MyInteger(11);

        if(m1.equals(m2))
            System.out.println("m1 == m2");
        else
            System.out.println("Hi");
    }
}
