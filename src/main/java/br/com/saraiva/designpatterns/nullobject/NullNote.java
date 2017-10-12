package br.com.saraiva.designpatterns.nullobject;

/**
 * Created by ifc.vinicius.saraiva on 11/10/17.
 */
public class NullNote extends Note {

    private static NullNote nullNote;

    private NullNote(){}

    public static Note getNote() {
        if (nullNote == null)
            return new NullNote();
        return nullNote;
    }

    public String getName() {
        return "pause";
    }
}
