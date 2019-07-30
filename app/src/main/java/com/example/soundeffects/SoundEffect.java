package com.example.soundeffects;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SoundEffect {
    private static final String TAG = "SoundEffects";

    private static final String SOUNDS_FOLDER = "sample_sounds";

    private AssetManager mAssets;
    private List<Sound> sounds = new ArrayList<>();

    public SoundEffect(Context context){
        mAssets = context.getAssets();
        loadSounds();
    }

    private void loadSounds(){
        String[] soundNames;

        try{
            //put the list of filenames in the sound folder.
            soundNames = mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG,"Found "+ soundNames.length +" sounds");
        }catch (IOException ioe){
            Log.e(TAG, "Could not list assests", ioe);
            return;
        }

        for(String filename : soundNames){
            String assetPath = SOUNDS_FOLDER + "/" + filename;
            Sound sound = new Sound(assetPath);
            sounds.add(sound);
        }
    }

    public List<Sound> getSounds(){
        return sounds;
    }
}
