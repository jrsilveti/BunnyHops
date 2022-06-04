import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BunnyHopsTest {

    BunnyHops bunnyHops = new BunnyHops();


    @Test
    public void zeroSteps() {
        int result = bunnyHops.bunnyHops(0);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void fourSteps() {
        int result = bunnyHops.bunnyHops(3);

        Assertions.assertEquals(4, result);
    }

    @Test
    public void oneHundredSteps() {
        int result = bunnyHops.bunnyHops(50);

        Assertions.assertEquals(906045778, result);
    }
}
