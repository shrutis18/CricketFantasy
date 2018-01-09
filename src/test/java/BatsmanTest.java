import org.junit.Assert;
import org.junit.Test;

public class BatsmanTest {

    @Test
    public void itShouldHaveAName() {
        //given
        Batsman batsman = new Batsman("Virat Kohli");
        //then
        Assert.assertEquals("Virat Kohli",batsman.getName());
    }

    @Test
    public void itShouldHaveZeroRunsAndZeroCatchesInitially() {
        //given
        Batsman batsman = new Batsman("Virat Kohli");
        //then
        Assert.assertEquals(0,batsman.getRunsScored());
        Assert.assertEquals(0,batsman.getCatches());
    }

    @Test
    public void itShouldBeAbleToSetRunsAndCatches() {
        //given
        Batsman batsman = new Batsman("Virat Kohli");
        //when
        batsman.setRunsScored(20);
        batsman.setCatches(2);
        //then
        Assert.assertEquals(20,batsman.getRunsScored());
        Assert.assertEquals(2,batsman.getCatches());
    }

    @Test
    public void itShouldBeAbleToCalculatePoints() {
        //given
        Batsman batsman = new Batsman("Virat Kohli");
        //when
        batsman.setRunsScored(35);
        batsman.setCatches(2);
        //then
        Assert.assertEquals(105,batsman.calculatePoints());
    }
}
