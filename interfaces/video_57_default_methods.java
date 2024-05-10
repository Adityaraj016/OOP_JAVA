package interfaces;
interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Hello,adi here");
    }
    default void record4k(){
        greet();
        System.out.println("Recording in 4k....");
    }
}
interface mediaplayer{
    String[] songnames();
    void nextsong();
    void prevsong();
}
class phone{
    void pickcall(String number){
        System.out.println("picking up tha call from"+number);
    }
    void endcall(){
        System.out.println("Ending the call");
    }
}
class smartphone extends phone implements camera,mediaplayer{
    public void takesnap(){
        System.out.println("Picture clicked");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public String[] songnames(){
        String[] song={"Bekhayali","Lollipop","senorita"};
        return song;
    }
    public void nextsong(){
        System.out.println("moving to next song");
    }
    public void prevsong(){
        System.out.println("moving to previous song");
    }
//    public void record4k(){
//        System.out.println("Taking snap &Recording in 4k....");
//    }

}
public class video_57_default_methods {
    public static void main(String[] args) {
        smartphone sp=new smartphone();
        sp.pickcall("978");
        String[] ar = sp.songnames();
        for (String item: ar) {
            System.out.println(item);
        }                                                  
        sp.pickcall("9693968235");                         
        sp.record4k();//defaultbmethod is called
        camera c=new smartphone();

    }                                                      
}
