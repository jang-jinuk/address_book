import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.readCVS();
  }

  public List<List<String>> readCVS() {
    List<List<String>> cvsList = new ArrayList<List<String>>();
    File csv = new File("C:\\intelij\\CodeSquad-Test\\address_book\\name,adress,number.csv");
    BufferedReader br = null;
    String line = "";

    try{
      br = new BufferedReader(new FileReader(csv));
      while ((line = br.readLine()) != null) {
        List<String> aLine = new ArrayList<String>();
        String[] lineArr = line.split(",");
        aLine = Arrays.asList(lineArr);
        cvsList.add(aLine);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (br != null) {
          br.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return cvsList;
  }
}