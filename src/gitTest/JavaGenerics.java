package gitTest;
import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("uday");
    list.add("kumar");

    list.stream().forEach(System.out::print);
  }

}
