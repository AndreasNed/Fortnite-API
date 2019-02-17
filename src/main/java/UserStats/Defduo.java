package UserStats;

public class Defduo {

    private Default def;

    public Default getDefault ()
    {
        return def;
    }

    public void setDefault (Default def)
    {
        this.def = def;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [default = "+def+"]";
    }
}
