import edu.wku.sp23lab.ValidCardNumber;

public class Test {
    public static void main(String[] args) {
        System.out.println(ValidCardNumber.isValidCard(378282246310005L));
        System.out.println(ValidCardNumber.isValidCard(4242424242424242L));
        System.out.println(ValidCardNumber.isValidCard(4000056655665556L));
        System.out.println(ValidCardNumber.isValidCard(4000004840008001L));
        System.out.println(ValidCardNumber.isValidCard(2223003122003222L));
    }
}
