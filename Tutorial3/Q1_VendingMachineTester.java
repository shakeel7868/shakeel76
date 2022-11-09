package Tutorial3;

public class Q1_VendingMachineTester {
    public static void main(String[] args){
        Q1_VendingMachine machine1 = new Q1_VendingMachine(20);
        for(int i = 0; i < 25; i++)
            machine1.insertToken();
        System.out.println(machine1);
    }
}
