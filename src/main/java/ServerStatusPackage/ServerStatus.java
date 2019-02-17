package ServerStatusPackage;


import ServerStatusPackage.Time;




public class ServerStatus
{
    private Time time;

    private String message;

    private String version;

    private String status;

    public Time getTime ()
    {
        return time;
    }

    public void setTime (Time time)
    {
        this.time = time;
    }

    public String getMessage ()
    {
        return message;
    }

    public void setMessage (String message)
    {
        this.message = message;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "time = "+time+"\n message = "+message+"\n version = "+version+"\n status = "+status;
    }
}