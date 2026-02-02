public class Bank {
    static double RR = .4;

    private String name;
    private double customRR; //

    public Bank(String n) {
        name = n;

    }

    public String getName() {
        return name;
    }

    public static void main(String args) {
        Bank td = new Bank("TD bank");
        Bank wf = new Bank("Wells fargo");

        System.out.println(td.RR); //not allowed
        System.out.println(Bank.RR);
        System.out.println(td.getName());

    }

}
