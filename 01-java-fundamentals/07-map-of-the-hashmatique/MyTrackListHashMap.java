import java.util.HashMap;

public class MyTrackListHashMap{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Kryptonite", "If I go crazy will you still call me Superman?");
        trackList.put("Duck and Run", "I must have told you a thousand times, I won't duck and run.");
        trackList.put("Going Down In Flames", "I'm going down in flames, I'm falling into this again.");
        trackList.put("Loser", "You're getting closer to pushing me off life's little edge.");
        System.out.println(trackList.get("Kryptonite"));

        for(HashMap.Entry<String, String> getTrack : trackList.entrySet()){
            System.out.println("Song name: " + getTrack.getKey() + "   Lyrics: " + getTrack.getValue());
        }
    }
}