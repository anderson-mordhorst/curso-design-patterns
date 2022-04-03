package patterns.design.bridge;

import patterns.design.bridge.platforms.*;
import patterns.design.bridge.transmissions.RecordedLive;

public class Main {

    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new FacebookLive());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("Aguarde.....");
        RecordedLive live = new RecordedLive(platform);
        live.broadcasting();
        live.result();
        live.record();
    }
}
