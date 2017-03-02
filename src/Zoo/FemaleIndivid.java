package Zoo;

import java.time.LocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public class FemaleIndivid extends Individ {
    private int noLitters;

    public FemaleIndivid(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address, String name, LocalDate dateOfBirth, boolean dangerous, int noLitters) {
        super(tradName, latName, latFamily, arrivalDate, address, name, dateOfBirth, false, dangerous);
        this.noLitters = noLitters;
    }

    @Override
    public int getNoLitters() {
        return noLitters;
    }

    @Override
    public void addLitters(int noLitters) {
        this.noLitters += noLitters;
    }

    @Override
    public void addNewLitter() {
        this.noLitters++;
    }
}
