import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

@FunctionalInterface
interface IEmployee {
    int sum(int a, int b);
}

class Demo {
    public int sum(int a, int b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
      Map<Integer, String> map = new HashMap<>();
      map.put(1, "atul");
      map.put(2, "mithu");
      map.put(3, "aadhya");
      map.put(4, "kajol");

      for( Map.Entry<Integer, String> entry :map.entrySet()){
        System.out.println(entry.getKey() + " -> " + entry.getValue());
      }

    }
}