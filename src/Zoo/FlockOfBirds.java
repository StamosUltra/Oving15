package Zoo;

import java.time.LocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public class FlockOfBirds extends AnimalGroup{
    private final double averageWeight;
    private final boolean swimmer;

    public FlockOfBirds(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address, String groupName, int noIndividuals, double averageWeight, boolean swimmer) {
        super(tradName, latName, latFamily, arrivalDate, address, groupName, noIndividuals);
        this.averageWeight = averageWeight;
        this.swimmer = swimmer;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public boolean isSwimmer() {
        return swimmer;
    }
}
