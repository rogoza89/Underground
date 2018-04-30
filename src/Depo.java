import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Depo {
    public static List<Wagon> randomWagons = new ArrayList<>();

    public static List<Wagon> buyWagons() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            if (random.nextInt(100) < 30) {
                randomWagons.add(new MainWagon());
            }
            else randomWagons.add(new PassWagon());
        }
        return randomWagons;
    }
}
