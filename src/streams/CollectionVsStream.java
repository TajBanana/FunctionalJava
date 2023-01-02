package streams;

import java.util.ArrayList;
import java.util.List;

public class CollectionVsStream {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.add("adam");
    names.add("jim");
    names.add("jenny");

    names.remove(0);

    System.out.println(names);

    //  streams do not let you add or remove elements in the collection
    //  elements in the stream are only accessed in sequential order
    //  streams can only be traversed once

    names.stream().forEach(System.out::println);
  }
}
