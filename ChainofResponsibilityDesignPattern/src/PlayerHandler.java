public abstract class PlayerHandler {
    protected PlayerHandler sonrakiHandler;

    public PlayerHandler getSonrakiHandler() {
        return sonrakiHandler;
    }

    public void setSonrakiHandler(PlayerHandler sonrakiHandler) {
        this.sonrakiHandler = sonrakiHandler;
    }

    public abstract void play(String filePath);

}
