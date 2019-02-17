package UserStats;

public class Default {

    private String kills;

    private String score;

    private String placetop1;

    private String minutesplayed;

    private String placetop12;

    private String playersoutlived;

    private String matchesplayed;

    private String placetop5;

    private String lastmodified;

    public String getKills() {
        return kills;
    }

    public void setKills(String kills) {
        this.kills = kills;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getPlacetop1() {
        return placetop1;
    }

    public void setPlacetop1(String placetop1) {
        this.placetop1 = placetop1;
    }

    public String getMinutesplayed() {
        return minutesplayed;
    }

    public void setMinutesplayed(String minutesplayed) {
        this.minutesplayed = minutesplayed;
    }

    public String getPlacetop12() {
        return placetop12;
    }

    public void setPlacetop12(String placetop12) {
        this.placetop12 = placetop12;
    }

    public String getPlayersoutlived() {
        return playersoutlived;
    }

    public void setPlayersoutlived(String playersoutlived) {
        this.playersoutlived = playersoutlived;
    }

    public String getMatchesplayed() {
        return matchesplayed;
    }

    public void setMatchesplayed(String matchesplayed) {
        this.matchesplayed = matchesplayed;
    }

    public String getPlacetop5() {
        return placetop5;
    }

    public void setPlacetop5(String placetop5) {
        this.placetop5 = placetop5;
    }

    public String getLastmodified() {
        return lastmodified;
    }

    public void setLastmodified(String lastmodified) {
        this.lastmodified = lastmodified;
    }

    @Override
    public String toString() {
        return "STATS:[kills = " + kills + ", score = " + score + ", placetop1 = " + placetop1 + ", minutesplayed = " + minutesplayed + ", placetop12 = " + placetop12 + ", playersoutlived = " + playersoutlived + ", matchesplayed = " + matchesplayed + ", placetop5 = " + placetop5 + ", lastmodified = " + lastmodified + "]";
    }
}
