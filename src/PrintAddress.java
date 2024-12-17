import java.util.List;

public class PrintAddress {
    public static void main(String[] args) {
        Address address = new Address(); 

        // 주소록 데이터를 출력
        System.out.println("=== Address List ===");
        for (List<String> addr : address.getAddressList()) {
            System.out.println("Name: " + addr.get(0));
            System.out.println("Address: " + addr.get(1));
            System.out.println("Number: " + addr.get(2));
            System.out.println("-------------------");
        }
    }
}
