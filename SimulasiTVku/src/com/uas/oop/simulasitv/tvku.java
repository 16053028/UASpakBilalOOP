package com.uas.oop.simulasitv;

import java.util.ArrayList;

public class tvku implements ITelevision{
    private String tvName;
    private int volumeTV;
    private int indexChannelView=1;
    private ArrayList<remote> tvRemote;

    // ================================== Constructor  ==================================
    public tvku(String tvName) {
        this.tvName = tvName;
        this.tvRemote = new ArrayList<remote>();
        standartRemoteButton();
    }


    // ================================== Getter  ==================================

    public String getTvName() {
        return tvName;
    }

    public int getVolumeTV() {
        return volumeTV;
    }

    public int getIndexChannelView() {
        return indexChannelView;
    }

    // ================================== Implement Interface  ==================================

    @Override
    public boolean power(boolean tvON){
        if (!tvON){
            System.out.println("The TV is now Shutting Down...");
        }
        System.out.println("The TV is now Started...");
        return tvON;
    }

    public void currentChannel(int indexChannelView){
        System.out.println( "\n\nYou are viewing Channel " + tvRemote.get(indexChannelView).getRemoteCommand()+"\n"+
                            "Channel number : " + tvRemote.get(indexChannelView).getRemoteButton());
    }


    public void changeChannel(String buttonLabel){
        int possition = findButtonIndex(buttonLabel);
        if (possition == 10){
            indexChannelView += 1;
            if (indexChannelView > 9){
                indexChannelView = 1;
            }
        }else if (possition == 11){
            indexChannelView -= 1;
            if (indexChannelView == 0){
                indexChannelView = 9;
            }
        }
        currentChannel(getIndexChannelView());
    }

    public void changeVolume(String buttonLabel){
        int possition = findButtonIndex(buttonLabel);
        if (possition == 12){
            this.volumeTV+=1;
        }else if(possition == 13){
            this.volumeTV-=1;
        }
        System.out.println("Your tv Volume now is : " + this.volumeTV);
    }

    // fitur yang kurang
    // EditChannel.

    // ================================== Standart Remote Function  ==================================

    private void standartRemoteButton(){
        //tvRemote.add(remoteNumber);
        // number Q is turn off
        // number 1 - 9 is set Channel
        // number > is next channel and < is prev channel
        // number + is volume up and - is volume down
        // number M is for menu
        // number * is for setting

        tvRemote.add(remote.createRemoteButton("Q","TURN OFF"));
        tvRemote.add(remote.createRemoteButton("1","TVRI"));
        tvRemote.add(remote.createRemoteButton("2","TRANS TV"));
        tvRemote.add(remote.createRemoteButton("3","ANTV"));
        tvRemote.add(remote.createRemoteButton("4","INDOSIAR"));
        tvRemote.add(remote.createRemoteButton("5","RCTI"));
        tvRemote.add(remote.createRemoteButton("6","EMPTY CHANNEL"));
        tvRemote.add(remote.createRemoteButton("7","EMPTY CHANNEL"));
        tvRemote.add(remote.createRemoteButton("8","EMPTY CHANNEL"));
        tvRemote.add(remote.createRemoteButton("9","EMPTY CHANNEL"));
        tvRemote.add(remote.createRemoteButton(">","NEXT CHANNEL"));
        tvRemote.add(remote.createRemoteButton("<","PREV CHANNEL"));
        tvRemote.add(remote.createRemoteButton("+","VOLUME UP"));
        tvRemote.add(remote.createRemoteButton("-","VOLUME DOWN"));
    }

    private int findButtonIndex(remote tvRemote){
        return this.tvRemote.indexOf(tvRemote);
    }

    private int findButtonIndex(String buttonPressed){
        for (int i=0; i<this.tvRemote.size(); i++){
            remote tvRemote = this.tvRemote.get(i);
            if(tvRemote.getRemoteButton().equals(buttonPressed)){
                return i;
            }
        }
        return -1;
    }

    // ================================== Standart Function  ==================================

}
