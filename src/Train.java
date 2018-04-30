import java.util.ArrayList;
import java.util.List;

public class Train {
    public static List<Wagon> completeTrain = new ArrayList<>();

    @Override
    public String toString() {
        return "Train{"+ completeTrain +
                "}";
    }
}
