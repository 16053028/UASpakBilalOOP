package com.uas.oop.simulasitv;

public class Channels {
    private String channelName;
    private String channelUHV;

    public Channels(String channelName, String channelUHV) {
        this.channelName = channelName;
        this.channelUHV = channelUHV;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getChannelUHV() {
        return channelUHV;
    }

    public static Channels createChannel(String channelName, String channelUHV){
        return new Channels(channelName,channelUHV);
    }
}
