package patterns.design.bridge.transmissions;

import patterns.design.bridge.platforms.IPlatform;

public class RecordedLive extends Live {

    public RecordedLive(IPlatform platform) {
        super(platform);
    }

    public void record() {
        System.out.println("Gravando a transmissão");
    }
}
