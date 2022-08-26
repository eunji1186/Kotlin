package section3;

/*
public class KCustomerAccess {
    public static void main(String[] agrs){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();
    }
}
*/

public class KCustomerAccess {
    public static void main(String[] agrs){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();

        KJob kjob=KCustomer.JOB;
        System.out.println(kjob.getTitle());

        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}