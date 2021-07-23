import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    @Test
    public void getNumberOfPets() {
        //given
        Pets pet = new Pets;
        int expected = 3;
        expected = pet.setNumberOfPets;
        //when
        int actual = pet.getNumberOfPets;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPetName() {
        //given
        Pets pet = new Pets;
        int expected = pet.setPetName;
        //when
        int actual = pet.getPetName;
        //then
        Assert.assertEquals(expected, actual);
    }
}
