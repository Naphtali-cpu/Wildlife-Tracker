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
}