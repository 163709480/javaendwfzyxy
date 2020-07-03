package com.company;

public class inphone implements SmartPHONE{
    @Override
    public void faceTime() {
        System.out.println("视频通话");
    }

    @Override
    public void newWork() {
        System.out.println("浏览网页");
    }

    @Override
    public void powerON() {
        System.out.println("已经开机");

    }

    @Override
    public void powerOFF() {
        System.out.println("关机");

    }

    @Override
    public void receiveMessages() {
        System.out.println("接受短信");
    }

    @Override
    public void call() {
        System.out.println("语音通话");
    }

    @Override
    public void MIUI() {
        System.out.println("MIUI1111");
    }
}
