package ServerStatusPackage;

public class Duration
{
    private String seconds;

    private String formated;

    public String getSeconds ()
    {
        return seconds;
    }

    public void setSeconds (String seconds)
    {
        this.seconds = seconds;
    }

    public String getFormated ()
    {
        return formated;
    }

    public void setFormated (String formated)
    {
        this.formated = formated;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [seconds = "+seconds+", formated = "+formated+"]";
    }
}