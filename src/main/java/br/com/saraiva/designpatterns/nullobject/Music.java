package br.com.saraiva.designpatterns.nullobject;

import java.util.List;

/**
 * Created by ifc.vinicius.saraiva on 11/10/17.
 */
public class Music {

    private List<Sound> sounds;

    public void setSounds(List<Sound> sounds) {
        this.sounds = sounds;
    }

    public void play() {
        sounds.forEach(sound -> System.out.print(sound.getNote().getName() + " with duration " + sound.getDuration() + " "));
    }
}
