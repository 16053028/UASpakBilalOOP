package com.uas.oop.simulasitv;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class remote {
    private String remoteButton;
    private String remoteCommand;

    public remote(String remoteButton, String remoteCommand) {
        this.remoteButton = remoteButton;
        this.remoteCommand = remoteCommand;
    }

    public String getRemoteButton() {
        return remoteButton;
    }

    public String getRemoteCommand() {
        return remoteCommand;
    }

    public static remote createRemoteButton(String remoteButton, String remoteCommand){
        return new remote(remoteButton, remoteCommand);
    }
}
