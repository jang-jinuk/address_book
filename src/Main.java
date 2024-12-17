import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.printOpeningMessage();
    main.showManu();

//    main.readCVS();
  }

  public void showManu() {
    System.out.println("사용하고 싶은 기능의 번호를 입력하세요.");
    System.out.println("1. 데이터 읽기\n2. 데이터 추가\n3. 데이터 초기화\n4. 종료");
  }

  public void printOpeningMessage() {
    System.out.println("주소록 프로그램을 시작합니다.");
    System.out.println("--------------------------");
  }


//  public List<List<String>> readCVS() {
//    List<List<String>> cvsList = new ArrayList<List<String>>();
//    File csv = new File("C:\\intelij\\CodeSquad-Test\\address_book\\name,adress,number.csv");
//    BufferedReader br = null;
//    String line = "";
//
//    try{
//      br = new BufferedReader(new FileReader(csv));
//      while ((line = br.readLine()) != null) {
//        List<String> aLine = new ArrayList<String>();
//        String[] lineArr = line.split(",");
//        aLine = Arrays.asList(lineArr);
//        cvsList.add(aLine);
//      }
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      try {
//        if (br != null) {
//          br.close();
//        }
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }
//    return cvsList;
//  }
}