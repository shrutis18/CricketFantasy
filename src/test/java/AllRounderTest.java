import org.junit.Assert;
import org.junit.Test;

public class AllRounderTest {
    @Test
    public void itShouldBeAbleToCalculatePoints() {
        //given
        AllRounder aAllRounder = new AllRounder("Virat Kohli");
        //when
        aAllRounder.setRunsScored(35);
        aAllRounder.setCatches(2);
        //then
        Assert.assertEquals(74,aAllRounder.calculatePoints());
    }
}
