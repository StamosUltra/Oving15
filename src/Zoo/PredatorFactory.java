package Zoo;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public class PredatorFactory {

    public PredatorFactory(){}

    public ScandinavianPredators nyBinne(String name, LocalDate arrivalDate, String address, LocalDate dateOfBirth, int noLitters){
        if (name == null || name.trim().equals("")) throw new IllegalArgumentException("Fant ikke noe navn");
        if (dateOfBirth.compareTo(ChronoLocalDate.from(LocalDate.now())) > 0) throw  new IllegalArgumentException("Fødselsdato kan ikke være etter dagens dato.");

        return new FemaleIndivid("Brunbjørn", "Ursus artcos", "Ursidae", arrivalDate, address, name, dateOfBirth, true, noLitters);
    }
    public ScandinavianPredators nyHannbjørn(String name, LocalDate arrivalDate, String address, LocalDate dateOfBirth){
        if (name == null || name.trim().equals("")) throw new IllegalArgumentException("Fant ikke noe navn");
        if (dateOfBirth.compareTo(ChronoLocalDate.from(LocalDate.now())) > 0) throw  new IllegalArgumentException("Fødselsdato kan ikke være etter dagens dato.");

        return new MaleIndivid("Brunbjørn", "Ursus artcos", "Ursidae", arrivalDate, address, name, dateOfBirth,  true);
    }
    public ScandinavianPredators nyUlvetispe(String name, LocalDate arrivalDate, String address, LocalDate dateOfBirth, int noLitters){
        if (name == null || name.trim().equals("")) throw new IllegalArgumentException("Fant ikke noe navn");
        if (dateOfBirth.compareTo(ChronoLocalDate.from(LocalDate.now())) > 0) throw  new IllegalArgumentException("Fødselsdato kan ikke være etter dagens dato.");

        return new FemaleIndivid("Ulv", "Canis lupus", "Canidae", arrivalDate, address, name, dateOfBirth,  true, noLitters);
    }
    public ScandinavianPredators nyUlvehann(String name, LocalDate arrivalDate, String address, LocalDate dateOfBirth){
        if (name == null || name.trim().equals("")) throw new IllegalArgumentException("Fant ikke noe navn");
        if (dateOfBirth.compareTo(ChronoLocalDate.from(LocalDate.now())) > 0) throw  new IllegalArgumentException("Fødselsdato kan ikke være etter dagens dato.");

        return new MaleIndivid("Ulv", "Canis lupus", "Canidae", arrivalDate, address, name, dateOfBirth,  true);
    }
}
