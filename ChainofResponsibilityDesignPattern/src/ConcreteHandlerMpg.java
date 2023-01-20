public class ConcreteHandlerMpg extends PlayerHandler{
    @Override
    public void play(String filePath) {
        if(filePath.endsWith(".mpg")){
            System.out.println("mpg dosyası oynatılıyor..." + filePath);
        }
        else if (sonrakiHandler != null){
            getSonrakiHandler().play(filePath);
        }
    }
}
