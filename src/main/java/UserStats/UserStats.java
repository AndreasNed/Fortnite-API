package UserStats;

public class UserStats {

    private String accountId;

    private Data data;

    private String epicName;

    private String[] devices;

    private String seasonWindow;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getEpicName() {
        return epicName;
    }

    public void setEpicName(String epicName) {
        this.epicName = epicName;
    }

    public String[] getDevices() {
        return devices;
    }

    public void setDevices(String[] devices) {
        this.devices = devices;
    }

    public String getSeasonWindow() {
        return seasonWindow;
    }

    public void setSeasonWindow(String seasonWindow) {
        this.seasonWindow = seasonWindow;
    }

    @Override
    public String toString() {
        return "[accountId = " + accountId + "\n data = " + data + "\n epicName = " + epicName + "\n devices = " + devices + "\n seasonWindow = " + seasonWindow + "]";
    }
}
