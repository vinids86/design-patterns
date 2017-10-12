package br.com.saraiva.designpatterns.nullobject;

/**
 * Created by ifc.vinicius.saraiva on 11/10/17.
 */
public class Note {
    private String name;

    public Note(String name) {
        this.name = name;
    }

    public Note() {
    }

    public String getName() {
        return name;
    }
}
