import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void speakTest() {
        //given
        Cat cat = new Cat(null, null, null);
        String expected = "purr";

        //when
        cat.speak();

        //then
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        //given
        Cat cat = new Cat(null, null, null);
        String expected = "Magna";
        cat.setName(expected);

        //when
        String actual = cat.getName(expected);

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAge() {
        //given
        Cat cat = new Cat(null, null, null);
        int expected= 90;
        cat.setAge(expected);

        //when
        int actual= cat.getAge();

        //then
        Assert.assertEquals(expected, actual);
    }
}
