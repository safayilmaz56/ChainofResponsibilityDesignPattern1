public class ConcreteHandlerMp4 extends PlayerHandler{
    @Override
    public void play(String filePath) {
        if(filePath.endsWith("mp4")){
            System.out.println("mp4 dosyasi oynatiliyor..."+ filePath);
        }
        else if (sonrakiHandler != null){
            sonrakiHandler.play(filePath);
        }
    }
}
