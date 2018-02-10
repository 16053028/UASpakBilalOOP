package com.uas.oop.simulasitv;

public interface ITelevision {
    boolean power(boolean tvON);
    void currentChannel(int indexChannelView);
    void changeChannel(String buttonLabel);
    void changeVolume(String buttonLabel);
    int getIndexChannelView();
}
