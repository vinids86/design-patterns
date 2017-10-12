package br.com.saraiva.designpatterns;

import br.com.saraiva.designpatterns.nullobject.*;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternsApplication {

	public static void main(String[] args) {
		final Music music = new Music();

		final Note silence = NullNote.getNote();
		final Note c = new Note("dó");

		final Sound pause = new Sound();
		final Sound sound = new Sound();

		pause.setNote(silence);
		pause.setDuration(Duration.QUARTIFUSA);

		sound.setNote(c);
		sound.setDuration(Duration.COLCHEIA);

		List<Sound> sounds = new ArrayList<>();

		sounds.add(pause);
		sounds.add(sound);

		music.setSounds(sounds);

		music.play();

	}
}
