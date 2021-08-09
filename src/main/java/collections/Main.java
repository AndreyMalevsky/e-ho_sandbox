package collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Client client1 = new Client(123, "Ваня");
        Client client2 = new Client(456, "Саша", "Иванов");
        Client client3 = new Client(456, "Саша", "Кузнецов");
        System.out.println(client2.equals(client3));
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());
//        System.out.println(client1.name);
//        System.out.println(client2);
        ArrayList<String> list = new ArrayList<String>();
        int[] array1 = new int[5];
        array1[0] = 1;
    }
}