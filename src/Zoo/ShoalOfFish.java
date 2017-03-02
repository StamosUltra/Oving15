package Zoo;

import java.time.LocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public class ShoalOfFish extends AnimalGroup {
    private final double averageLength;
    private final boolean shareAquarium;

    public ShoalOfFish(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address, String groupName, int noIndividuals, double averageLength, boolean shareAquarium) {
        super(tradName, latName, latFamily, arrivalDate, address, groupName, noIndividuals);
        this.averageLength = averageLength;
        this.shareAquarium = shareAquarium;
    }

    public double getAverageLength() {
        return averageLength;
    }

    public boolean isShareAquarium() {
        return shareAquarium;
    }
}
