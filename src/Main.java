import java.util.Scanner;

public class Main {

    Address address = new Address();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.printOpeningMessage();
        main.addressBookController();
        //    main.readCVS();
    }

    public void printOpeningMessage() {
        System.out.println("주소록 프로그램을 시작합니다.");
        System.out.println("--------------------------");
    }

    public void addressBookController() {
        int input = 0;
        while (true) {
            showManu();
            input = getInput();
            if (input == 1) {

            } else if (input == 2) {
                String userName = printNamePrompt();
                String userAddress = printAddressPrompt();
                String userNumber = printNumberPrompt();
                address.setAddress(userName, userAddress, userNumber);
                System.out.println();
            } else if (input == 3) {
                address.deleteAllAddress();
            } else {
                printEndingMessage();
                return;
            }
        }
    }

    public void showManu() {
        System.out.println("사용하고 싶은 기능의 번호를 입력하세요.");
        System.out.println("1. 데이터 읽기\n2. 데이터 추가\n3. 데이터 초기화\n4. 종료");
    }

    public int getInput() {
        String input = scanner.nextLine();
        int inputNumber = Integer.parseInt(input);
        return inputNumber;
    }

    public void printEndingMessage() {
        System.out.println("----프로그램을 종료합니다.----");
    }

    public String printNamePrompt() {
        System.out.println("이름을 입력해주세요.");
        String userName = scanner.nextLine();
        return userName;
    }

    public String printAddressPrompt() {
        System.out.println("주소를 입력하세요.");
        String userAddress = scanner.nextLine();
        return userAddress;
    }

    public String printNumberPrompt() {
        System.out.println("전화번호를 입력하세요.");
        String userNumber = scanner.nextLine();
        return userNumber;
    }
}