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
        int result = bunnyHops.bunnyHops(4);

        Assertions.assertEquals(7, result);
    }

    @Test
    public void oneHundredSteps() {
        int result = bunnyHops.bunnyHops(100);

        Assertions.assertEquals(7, result);
    }
}
