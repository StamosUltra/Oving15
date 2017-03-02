package Zoo;

import java.time.LocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public interface ScandinavianPredators {
    String getName();
    LocalDate getDateOfBirth();
    int getAge();
    String getAddress();
    void move(String newAddress);
    String printInfo();
    int getNoLitters();
    void addLitters(int noLitters);
    void addNewLitter();
}
