import junit.framework.TestCase;

public class ExpressTrainTest extends TestCase {
    public void testConstructor() {
        new ExpressTrain("New York - Boston", "23:50 - 13:20");
        new LocalTrain("Chicago - New York", "10:34 - 13:18");
    }
}
