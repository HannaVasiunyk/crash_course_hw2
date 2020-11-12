import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();

        birds.add(new Eagle(true, true));
        birds.add(new Swallow(true, true));
        birds.add(new Penguin(false, true));
        birds.add(new Chicken(true, true));

        birds.forEach(bird -> System.out.println(bird.fly()));
    }
}
