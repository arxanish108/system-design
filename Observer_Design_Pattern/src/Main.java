
public class Main {
    public static void main(String[] args) {
        YouTubeInterface youTubeInterface = new Youtube();


        SuscriberInterface subscriberInter1 = new Suscriber("Anish");
        SuscriberInterface subscriberInter2 = new Suscriber("Aman");
        youTubeInterface.suscribe(subscriberInter1);
        youTubeInterface.suscribe(subscriberInter2);
        youTubeInterface.videoUploaded("Basic Java");
        youTubeInterface.videoUploaded("Basic Python");

    }


}