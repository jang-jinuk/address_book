import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Address {
  private String name;
  private String address;
  private String number;
  private List<List<String>> addressList;

  public Address(String name, String address, String number) {
    this.name = name;
    this.address = address;
    this.number = number;
  }

  public List<List<String>> getAddressList() {
    return addressList;
  }

  public void setAddress(String name, String address, String number) {
    addressList.add(new ArrayList<>(Arrays.asList(name, address, number)));
  }
}
