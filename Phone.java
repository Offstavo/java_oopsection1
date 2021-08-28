package com.example.oopsection1;

public class Phone {

    private String name;
    //this string is only accessible from this class only
    private int screenSize;
    private int memoryRam;
    private int camera;

    //rightclick go to generate menu then make a constructor
    //a constructor cannot be private
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

    public Phone(String name, int memoryRam) {
        this.name = name;
        this.memoryRam = memoryRam;
    }

    public void playMusic(String trackName){
        System.out.println("Playing "+ trackName);
    }

    //to access and use the private variable we use a method
    public void setName(String name){
        this.name = name;
        //we reffering to the name in line 4/name in THIS class phone
    }

    public String getName(){
        return this.name;
    }

    //set the access modifiers of all the methods to private
    //press alt+insert to create getter and setter methods

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}
