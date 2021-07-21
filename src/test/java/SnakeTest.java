import org.junit.Assert;
import org.junit.Test;

public class SnakeTest {
    @Test
    public void speakTest() {
        //given
        Snake dog = new Snake(null, null, null);
        String expected = "slytherin";

        //when
        dog.speak();

        //then
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        //given
        Snake dog = new Snake(null, null, null);
        String expected = "Severus";
        dog.setName(expected);

        //when
        String actual = dog.getName(expected);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        //given
        Snakes cat = new Snake(null, null, null);
        int expected= 9876787643232589654346599068;
        cat.setAge(expected);

        //when
        int actual= cat.getAge();

        //then
        Assert.assertEquals(expected, actual);
    }
}
