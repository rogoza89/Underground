import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Metro {
    public static void main(String[] args) {

        Depo.buyWagons();
        for (Train list: createTrain(Depo.randomWagons)) {
            System.out.println(list);
        }

    }

    public static List<Train> createTrain(List<Wagon> rndWagons) {
        Iterator<Wagon> wagonIterator = rndWagons.iterator();
        List<Train> trains = new ArrayList<>();
        Train train = new Train();

        while (wagonIterator.hasNext()) {
            Wagon wagon = wagonIterator.next();
            if (wagon instanceof MainWagon) {
                if (train.completeTrain.size() == 0 || train.completeTrain.size() == 4) {
                    train.completeTrain.add(wagon);
                }
            } else {
                if (train.completeTrain.size() > 0 && train.completeTrain.size() < 4) {
                    train.completeTrain.add(wagon);
                } else {
                    if (train.completeTrain.size() == 5) {
                        trains.add(train);
                        train = new Train();
                        }
                    }
                }
            }
        return trains;
    }
}
