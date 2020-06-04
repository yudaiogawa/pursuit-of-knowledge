import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Stream {

  public static void main(String[] args) {
    sample(createModel()).stream().forEach(m -> printModel(m));
  }

  private static List<Model> sample(List<Model> models) {
    return models.stream().filter(Objects::nonNull).collect(Collectors.toList());
  }

  private static void printModel(Model m) {
    System.out.println("[Name] " + m.getName() + " [Age] " + m.getAge());
  }

  private static List<Model> createModel() {
    List<Model> models = new ArrayList<>();
    models.add(new Model("mi-pan", 20));
    models.add(new Model("kyonko", 23));
    models.add(new Model("katoshi", 22));
    models.add(null);
    models.add(new Model("hinano", 16));
    return models;
  }
}
