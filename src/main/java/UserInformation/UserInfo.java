
public class UserInfo {

    private String uid;

    private String[] seasons;

    private String username;

    private String[] platforms;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String[] getSeasons() {
        return seasons;
    }

    public void setSeasons(String[] seasons) {
        this.seasons = seasons;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "UserInfo: uid = " + uid + "\n seasons = " + seasonsToString() + "\n username = " + username + "\n platforms = " + platformsToString();
    }

    public String seasonsToString() {
        String s = "";
        for (String season : seasons) {
            s = s + season;
        }
        return s;
    }

    public String platformsToString() {
        String s = "";
        for (String platform : platforms) {
            s = s + platform;
        }
        return s;
    }

    public String getMainPlatform() {
        return platforms[0];
    }
    public String getMainSeason(){
        return seasons[0];
    }
}
