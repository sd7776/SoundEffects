package com.example.soundeffects;

public class SoundViewModel {
    private Sound sound;
    private SoundEffect soundEffect;

    public SoundViewModel(SoundEffect soundEffect){
        this.soundEffect = soundEffect;
    }

    public String getTitle(){
        return sound.getName();
    }
    public Sound getSound(){
        return sound;
    }

    public void setSound(Sound sound){
        this.sound = sound;
    }
}
