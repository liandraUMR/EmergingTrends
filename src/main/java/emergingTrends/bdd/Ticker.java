package emergingTrends.bdd;

/**
 * Created by bmart on 21-Jan-2016.
 */
public class Ticker
{
    private static final double ticker = 5 ;
    private double time;

    public double getTime() {
        return time;
    }

    public static double getTicker() {
        return ticker;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void tickTime()
    {
        time = time + ticker;
    }
}
