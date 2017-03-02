import Zoo.*;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

/**
 * Created by joaki on 02.03.2017.
 */
public class ScandinavianPredatorsTest {

    static ScandinavianPredators bjørnar;
    static ScandinavianPredators ulvina;

    @org.junit.Before
    public void setUp() throws Exception {
        PredatorFactory factory = new PredatorFactory();
        LocalDate date = LocalDate.of(1994, 8, 12);
        bjørnar = factory.nyHannbjørn("Bjørnar", LocalDate.now(), "Bjørnehiet", date);
        ulvina = factory.nyUlvetispe("Ulvina", LocalDate.now(), "Ulvsetergate", date, 5);
    }

    @Test
    public void getName(){
        assertEquals("Bjørnar", bjørnar.getName());
    }

    @Test
    public void getDateOfBirth(){
        String dateOfBirth = bjørnar.getDateOfBirth().toString();
        assertEquals("1994-08-12", dateOfBirth);
    }

    @Test
    public void getAge(){
        assertEquals(23, bjørnar.getAge());
    }

    @Test
    public void getAddress(){
        assertEquals("Bjørnehiet", bjørnar.getAddress());
    }

    @Test
    public void move(){
        bjørnar.move("Ny adresse");
        assertEquals("Ny adresse", bjørnar.getAddress());
    }

    @Test
    public void printInfo(){
        assertEquals("Navn: Bjørnar\n" +
                "Fødselsdato: 1994-08-12\n" +
                "Kjønn: Hannkjønn\n" +
                "Farlig\n" +
                "Norsk navn: Brunbjørn\n" +
                "Latinsk navn og familie: Ursus artcos, Ursidae\n" +
                "Adresse: Bjørnehiet",
                bjørnar.printInfo());
    }
    @Test
    public void getNoLitters(){
        assertEquals(5, ulvina.getNoLitters());
        assertEquals(0, bjørnar.getNoLitters());
    }

    @Test
    public void addLitters(){
        ulvina.addLitters(4);
        bjørnar.addLitters(4);
        assertEquals(9, ulvina.getNoLitters());
        assertEquals(0, bjørnar.getNoLitters());
    }

    @Test
    public void addNewLitter(){
        ulvina.addNewLitter();
        bjørnar.addNewLitter();
        assertEquals(6, ulvina.getNoLitters());
        assertEquals(0, bjørnar.getNoLitters());
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}