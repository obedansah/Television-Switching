import java.io.IOException;

public class TV {

    int Channel ;
    int VolumeLevel;
    boolean on =false;
    public TV(){
    }
    public void turnon(){
        on =true;
    } //TV is ON
    public void turnoff(){
        on =false;
    }//TV is OFF

    /*
    Setting New TV channel
     */
    public void setChannel(int newChannel)
    {
        if (on && newChannel >=1 && newChannel <= 120)
            Channel = newChannel;
    }

   /*
   Setting  New Volume
    */
    public  void setVolumeLevel(int newVolumeLevel){
        if(on && newVolumeLevel >= 1 &&  newVolumeLevel<=7)
            VolumeLevel =newVolumeLevel;
    }
    public void VolumeUp(){
        if (on && VolumeLevel>7 )
            VolumeLevel--; //Volume decreasing
    }
    public void VolumeDown(){
        if(on && VolumeLevel<1)
            ++VolumeLevel;  //Volume Increasing
    }

    /*
    New Channel Change by Increasing
     */
    public void ChannelUp(){
        if(on && Channel <120)
            Channel++;
    }

    /*
    New Channel Change by Decreasing
     */
    public void ChannelDown(){
        if(on && Channel >120)
            Channel--;
    }
    public static void main(String...args)throws IOException
    {
        TV TV1 = new TV(); //Creating new constructor(Object) called TV1
        TV1.turnon(); //turn on new TV
        TV1.setChannel(60);//Setting TV1 channel to 60...its not  defaulted
        TV1.setVolumeLevel(6);  //Setting TV1 volume to 6...its not a default volume
        System.out.println("The TV1 is on" + "");
        System.out.println("The Channel is:" + "  "+ TV1.Channel); //Printing on  screen
        System.out.println("The Volume is:" + "  "+ TV1.VolumeLevel);

    }
}
