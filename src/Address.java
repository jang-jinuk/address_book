import java.util.ArrayList;
import java.util.List;

public class Address {
  private String name;
  private String address;
  private String number;

  public Address(String name, String address, String number) {
    this.name = name;
    this.address = address;
    this.number = number;
  }

  public List<List<String>> getAddress() {
    List<List<String>> list = new ArrayList<>();
    return list;
  }

  public List<String> setAddress(String name, String address, String number) {
    List<String> list = new ArrayList<>();
    list.add(name);
    list.add(address);
    list.add(number);

    return list;
  }
}
