import java.util.ArrayList;
public class collection{
	 public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
list.add("Cherry");
String fruit = list.get(1);
for (String item : list) {
    System.out.println(item);
}
}
}