public class ConcreteHandlerAvi extends PlayerHandler{
    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".avi")){
            System.out.println("avi dosyasi oynatiliyor..." + filePath);
        } else if (sonrakiHandler != null) {
            sonrakiHandler.play(filePath);
        }
    }
}
