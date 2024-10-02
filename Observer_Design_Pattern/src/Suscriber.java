public class Suscriber implements SuscriberInterface{
    String name;
    Suscriber(String name){
        this.name = name;
    }
    @Override
    public void update(String content) {
        System.out.println("Hey "+name +" Check Out the new video released of "+content);
    }
}
