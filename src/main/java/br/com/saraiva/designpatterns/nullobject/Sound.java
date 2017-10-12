package br.com.saraiva.designpatterns.nullobject;

/**
 * Created by ifc.vinicius.saraiva on 12/10/17.
 */
public class Sound {
    private Note note;
    private Duration duration;

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
