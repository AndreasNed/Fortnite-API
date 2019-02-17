package ServerStatusPackage;

public class Since
{
    private String seconds;

    public String getSeconds ()
    {
        return seconds;
    }

    public void setSeconds (String seconds)
    {
        this.seconds = seconds;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [seconds = "+seconds+"]";
    }
}