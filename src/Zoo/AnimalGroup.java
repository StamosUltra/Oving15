package Zoo;

import java.time.LocalDate;

/**
 * Created by joaki on 02.03.2017.
 */
public class AnimalGroup extends Animal{
    private final String groupName;
    private int noIndividuals;

    public AnimalGroup(String tradName, String latName, String latFamily, LocalDate arrivalDate, String address, String groupName, int noIndividuals){
        super(tradName, latName, latFamily, arrivalDate, address);
        this.groupName = groupName;
        this.noIndividuals = noIndividuals;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getNoIndividuals() {
        return noIndividuals;
    }

    @Override
    public String getTradName(){
        return "Gruppe av " + super.getTradName() + "(er)";
    }

    public void setNoIndividuals(int noIndividuals) {
        this.noIndividuals = noIndividuals;
    }
}
