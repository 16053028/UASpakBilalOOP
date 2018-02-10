package com.uas.oop.simulasitv;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ITelevision myTV = new tvku("TV Rumah");

    public static void main(String[] args) {
        String volUp = "+";
        String volDown = "-";
        String channelNext = ">";
        String channelPrev = "<";
        String romoteMenu = "";
        boolean powerTV = true;
        int currentChannel=1;


        System.out.println("Your TV in on and only show Blank Screen");
        myTV.currentChannel(currentChannel);
        while(powerTV) {
            System.out.println("\n\n\n");
            showMenuTV();
            System.out.println("Enter the kode : (1-5)");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 0:
                    powerTV = false;
                    break;
                case 1:
                    myTV.changeChannel(channelNext);
                    currentChannel = myTV.getIndexChannelView();
                    break;
                case 2:
                    myTV.changeChannel(channelPrev);
                    currentChannel = myTV.getIndexChannelView();
                    break;
                case 3:
                    myTV.changeVolume(volUp);
                    break;
                case 4:
                    myTV.changeVolume(volDown);
                    break;
                default:
                    break;
            }
        }
    }

    public static void showMenuTV(){
        System.out.println( "\n\n\n\n1. Next Channel\n"+
                            "2. Prev Channel\n"+
                            "3. Increase Volume\n"+
                            "4. Decrease Volume\n"+
                            "0. Shutdown");
    }
}
