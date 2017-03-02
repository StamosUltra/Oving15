package Zoo;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 * Created by joaki on 02.03.2017.
 *
 * Issues:
 * method: getAge() doesn't only check for year, not month or day
 */
public abstract class Individ extends Animal implements ScandinavianPredators{
    private final String name;
    private final LocalDate dateOfBirth;
    private final boolean male;
    private final boolean dangerous;

    public Individ(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address, String name, LocalDate dateOfBirth, boolean male, boolean dangerous){
        super(tradName, latName, latFamily, arrivalDate, address);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.male = male;
        this.dangerous = dangerous;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isMale() {
        return male;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public String toString(){
        String gender = "Hannkjønn";
        String dangerous = "Farlig";
        if (!male) gender = "Hunnkjønn";
        if (!this.dangerous) dangerous = "Ikke farlig";

        return "Navn: " + name + "\nFødselsdato: " + getDateOfBirth().toString() + "\nKjønn: " + gender + "\n" + dangerous + "\n" + super.toString();
    }

    @Override
    public int getAge() {
        long age = LocalDate.now().getLong(ChronoField.YEAR) - getDateOfBirth().getLong(ChronoField.YEAR);
        return (int) age;
    }

    @Override
    public void move(String newAddress) {
        super.setAddress(newAddress);
    }

    @Override
    public String printInfo() {
        return toString();
    }

    public abstract int getNoLitters();

    public abstract void addLitters(int noLitters);

    public abstract void addNewLitter();
}
