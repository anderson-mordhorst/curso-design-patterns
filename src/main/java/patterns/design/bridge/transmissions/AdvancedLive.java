package patterns.design.bridge.transmissions;

import patterns.design.bridge.platforms.IPlatform;

public class AdvancedLive extends Live {

    public AdvancedLive(IPlatform platform) {
        super(platform);
    }

    public void subtitles() {
        System.out.println("Legendas ativadas na transmissão");
    }

    public void comments() {
        System.out.println("Comentários liberados na transmissão");
    }
}
