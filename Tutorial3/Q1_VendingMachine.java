package Tutorial3;

public class Q1_VendingMachine {
    private static int _tokenCount;
    private static int _cansCount;
    private static double _balance;

    public static int get_cansCount() {
        return _cansCount;
    }

    public static void set_cansCount(int _cansCount) {
        Q1_VendingMachine._cansCount = _cansCount;
    }

    public static double get_balance() {
        return _balance;
    }

    public static void set_balance(double _balance) {
        Q1_VendingMachine._balance = _balance;
    }

    public static int get_tokenCount(){
        return _tokenCount;
    }

    public static void set_tokenCount(int _tokenCount){
        Q1_VendingMachine._tokenCount = _tokenCount;
    }

    public Q1_VendingMachine(){
        set_cansCount(10);
    }

    public Q1_VendingMachine(int cans){
        set_cansCount(cans);
    }

    public String toString(){
        return super.toString() + "\nNo of soda cans : " + this.get_cansCount() + "\nNo of tokens " +
                " : " + this.get_tokenCount();
    }

    public void insertToken(){
        if (get_cansCount()>0){
            set_tokenCount(get_tokenCount()+1);
            set_cansCount(get_cansCount()-1);
            set_balance(get_balance()+100);
        }
        else
            System.out.println("There is no cans in vending machine");
    }

    public void fillUp(int cans){
        set_cansCount(cans);
    }
}
