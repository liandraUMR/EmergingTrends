package test.before;


import emergingTrends.bdd.Ticker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmart on 21-Jan-2016.
 */

public class TickerTest {

    Ticker ticker;
    double currentTimer;
    @Before
    public void setup()
    {
        ticker = new Ticker();
        currentTimer = 10;
    }

    @Test
    public void nooBDD()
    {

        ticker.setTime(currentTimer);
        ticker.tickTime();

        assertEquals(15.0,ticker.getTime(),0);
    }


    @Test
    public void withBDD()
    {
        //TODO BDD testing
    }
}
