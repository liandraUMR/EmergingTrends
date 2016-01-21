package test.after;


import emergingTrends.bdd.Ticker;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
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
        double expectval = currentTimer + ticker.getTicker();
        ticker.setTime(currentTimer);
        ticker.tickTime();

        assertEquals(expectval,ticker.getTime(),0);
    }
}
