
import ServerStatusPackage.ServerStatus;
import UserStats.UserStats;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FortniteStats {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        boolean run = true;
        while (run) {
            System.out.println("1) Search User info");
            System.out.println("2) Search User stats");
            System.out.println("3) Show server status");
            System.out.println("0) Exit");
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    System.out.print("User name: ");
                    String userName = sc.nextLine();
                    userInfo(userName);
                    break;
                case 2:
                    System.out.print("User name: ");
                    String info = sc.nextLine();
                    userStats(userInfoReturnAccountId(info), userInfoReturnPlatform(info));
                    break;
                case 3:
                    serverStatus();
                    break;
                case 0:
                    run = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void serverStatus() throws IOException {

        URL serverStatusUrl = new URL("https://fortnite-public-api.theapinetwork.com/prod09/status/fortnite_server_status");

        HttpURLConnection serverStatusConnection = (HttpURLConnection) serverStatusUrl.openConnection();

        serverStatusConnection.setRequestMethod("GET");
        serverStatusConnection.setRequestProperty("Accept", "application/json");
        serverStatusConnection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");

        if (serverStatusConnection.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error code: " + serverStatusConnection.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(serverStatusConnection.getInputStream()));

        String output = br.readLine();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        ServerStatus serverStatus = gson.fromJson(output, ServerStatus.class);

        System.out.println(serverStatus);

    }

    private static void userInfo(String userName) throws IOException {

        URL serverStatusUrl = new URL("https://fortnite-public-api.theapinetwork.com/prod09/users/id?username=" + userName);

        HttpURLConnection serverStatusConnection = (HttpURLConnection) serverStatusUrl.openConnection();

        serverStatusConnection.setRequestMethod("GET");
        serverStatusConnection.setRequestProperty("Accept", "application/json");
        serverStatusConnection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");

        if (serverStatusConnection.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error code: " + serverStatusConnection.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(serverStatusConnection.getInputStream()));

        String output = br.readLine();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        UserInfo userinfo = gson.fromJson(output, UserInfo.class);

        System.out.println(userinfo);

    }

    private static String userInfoReturnAccountId(String userName) throws IOException {
        URL serverStatusUrl = new URL("https://fortnite-public-api.theapinetwork.com/prod09/users/id?username=" + userName);

        HttpURLConnection serverStatusConnection = (HttpURLConnection) serverStatusUrl.openConnection();

        serverStatusConnection.setRequestMethod("GET");
        serverStatusConnection.setRequestProperty("Accept", "application/json");
        serverStatusConnection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");

        if (serverStatusConnection.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error code: " + serverStatusConnection.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(serverStatusConnection.getInputStream()));

        String output = br.readLine();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        UserInfo userinfo = gson.fromJson(output, UserInfo.class);
        return userinfo.getUid();
    }

    private static String userInfoReturnPlatform(String userName) throws IOException {
        URL serverStatusUrl = new URL("https://fortnite-public-api.theapinetwork.com/prod09/users/id?username=" + userName);

        HttpURLConnection serverStatusConnection = (HttpURLConnection) serverStatusUrl.openConnection();

        serverStatusConnection.setRequestMethod("GET");
        serverStatusConnection.setRequestProperty("Accept", "application/json");
        serverStatusConnection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");

        if (serverStatusConnection.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error code: " + serverStatusConnection.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(serverStatusConnection.getInputStream()));

        String output = br.readLine();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        UserInfo userinfo = gson.fromJson(output, UserInfo.class);
        return userinfo.getMainPlatform();
    }

    private static void userStats(String id, String platform) throws IOException {
        URL serverStatusUrl = new URL("https://fortnite-public-api.theapinetwork.com/prod09/users/public/br_stats_v2?user_id=" + id + "&platform=" + platform);

        HttpURLConnection serverStatusConnection = (HttpURLConnection) serverStatusUrl.openConnection();

        serverStatusConnection.setRequestMethod("GET");
        serverStatusConnection.setRequestProperty("Accept", "application/json");
        serverStatusConnection.setRequestProperty("User-Agent",
                "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");

        if (serverStatusConnection.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error code: " + serverStatusConnection.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(serverStatusConnection.getInputStream()));

        String output = br.readLine();
        output = output.replaceAll("default", "def");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        UserStats userStats = gson.fromJson(output, UserStats.class);

        System.out.println(userStats);

    }
}
