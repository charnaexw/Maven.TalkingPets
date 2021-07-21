import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void speakTest() {
        //given
        Dog cat =new Dog(null, null, null);
        String expected = "grrrr";

        //when
        String actual=cat.speak();

        //then

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        //given
        Dog cat = new Dog(null, null, null);
        String expected = "Kyrpto";
        cat.setName(expected);

        //when
        String actual = cat.getName(expected);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        //given
        Dog cat = new Dog(null, null, null);
        int expected= 3;
        cat.setAge(expected);

        //when
        int actual= cat.getAge();

        //then
        Assert.assertEquals(expected, actual);
    }
}
