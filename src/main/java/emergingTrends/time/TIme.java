package emergingTrends.time;

import emergingTrends.exceptions.InvalidTimeException;

/**
 * Created by 631152 on 1/19/2016.
 */
public class Time
{
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds)throws InvalidTimeException
    {
        if(minutes > 60 || minutes < 0)
        {
            throw new InvalidTimeException("Invalid Minute Range");
        }
        if(seconds > 60 || seconds < 0)
        {
            throw new InvalidTimeException("Invalid Second Range");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours()
    {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours = hours;
    }

    public int getMinutes()
    {
        return minutes;
    }

    public void setMinutes(int minutes) throws InvalidTimeException
    {
        if(minutes > 60 || minutes < 0)
        {
            throw new InvalidTimeException("Invalid Minute Range");
        }
        this.minutes = minutes;
    }

    public int getSeconds()
    {
        return seconds;
    }

    public void setSeconds(int seconds) throws InvalidTimeException
    {
        if(seconds > 60 || seconds < 0)
        {
            throw new InvalidTimeException("Invalid Second Range");
        }
        this.seconds = seconds;
    }
}
