import java.util.ArrayList;
import java.util.List;

public class Youtube implements YouTubeInterface{


    List<SuscriberInterface> suscriberInterfaces = new ArrayList<>();


    @Override
    public void suscribe(SuscriberInterface suscriberInterface) {
        this.suscriberInterfaces.add(suscriberInterface);
    }

    @Override
    public void unsuscribe(SuscriberInterface suscriberInterface) {
        this.suscriberInterfaces.remove(suscriberInterface);
    }

    @Override
    public void videoUploaded(String content) {
        for(SuscriberInterface su : this.suscriberInterfaces){
            su.update(content);
        }
    }
}
