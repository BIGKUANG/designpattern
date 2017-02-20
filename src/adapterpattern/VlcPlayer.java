package adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing vic file.name:"+fileName);

	}

	public void playMp4(String fileName) {
		
		//什么也不做
	}

}
