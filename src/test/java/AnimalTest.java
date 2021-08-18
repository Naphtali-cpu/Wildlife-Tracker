import org.junit.*;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public  class AnimalTest{

    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animal_instantiatesCorrectly_true() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals(true, testAnimal instanceof Animals);
    }

    @Test
    public void Animal_instantiatesWithName_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals("Buffalo", testAnimal.getName());
    }

    @Test
    public void Animal_instantiatesWithlocation_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals("Serengeti", testAnimal.getLocation());
    }

    @Test
    public void Animal_instantiatesWithRanger_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals("Naphtali", testAnimal.getRanger());
    }

    @Test
    public void Animal_instantiatesWithHealth_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals("Healthy", testAnimal.getHealth());
    }

    @Test
    public void Animal_instantiatesWithAge_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals("adult", testAnimal.getAge());
    }

    @Test
    public void Animal_instantiatesWithStatus_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");

        assertEquals("Endangered", testAnimal.getStatus());
    }
    @Test
    public void Animal_instantiatesWithHali_String() {
        Animals testAnimal = new Animals("Buffalo", "Naphtali","adult","Serengeti", "Healthy", "Endangered");
        assertEquals("Endangered", testAnimal.getStatus());
    }

    @Test
    public void Animal() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("Okay", testEndanger.getType());
    }
    @Test
    public void Animal2() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("Danger", testEndanger.getType2());
    }
    @Test
    public void Animal3() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("Safe", testEndanger.getType3());
    }
    @Test
    public void Animal4() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("Fine", testEndanger.getType4());
    }
    @Test
    public void Animal5() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("Risky", testEndanger.getType5());
    }

    @Test
    public void Animal6() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("Unpredicable", testEndanger.getType6());
    }
    @Test
    public void Animal7() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("friendly", testEndanger.getType7());
    }
    @Test
    public void Animal8() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("free", testEndanger.getType8());
    }
    @Test
    public void Animal9() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("unknown", testEndanger.getType9());
    }
    @Test
    public void Animal10() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("suspicious", testEndanger.getType10());
    }
    @Test
    public void Animal11() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("handled", testEndanger.getType11());
    }
    @Test
    public void Animal12() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("able", testEndanger.getType12());
    }
    @Test
    public void Animal13() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("unable", testEndanger.getType13());
    }
    @Test
    public void Animal14() {
        Endanger testEndanger = new Endanger("Okay", "Danger", "Safe", "Fine", "Risky", "Unpredicable", "friendly", "free", "unknown", "suspicious", "handled", "able", "unable", "vigorous");
        assertEquals("vigorous", testEndanger.getType14());
    }

}