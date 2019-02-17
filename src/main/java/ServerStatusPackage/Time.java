package ServerStatusPackage;

public class Time
{
    private Duration duration;

    private Since since;

    public Duration getDuration ()
    {
        return duration;
    }

    public void setDuration (Duration duration)
    {
        this.duration = duration;
    }

    public Since getSince ()
    {
        return since;
    }

    public void setSince (Since since)
    {
        this.since = since;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [duration = "+duration+", since = "+since+"]";
    }
}