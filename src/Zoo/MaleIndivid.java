package Zoo;

import java.time.LocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public class MaleIndivid extends Individ {
    public MaleIndivid(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address, String name, LocalDate dateOfBirth, boolean dangerous) {
        super(tradName, latName, latFamily, arrivalDate, address, name, dateOfBirth, true, dangerous);
    }

    @Override
    public int getNoLitters() {
        return 0;
    }

    @Override
    public void addLitters(int noLitters) {

    }

    @Override
    public void addNewLitter() {

    }
}
