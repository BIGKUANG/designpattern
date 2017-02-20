package adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "童话.mp3");
		audioPlayer.play("mp4", "大话西游只大圣娶亲.mp4");
		audioPlayer.play("vlc", "麦克杰克逊.vlc");
		audioPlayer.play("avi", "波多野结衣.avi");

	}

}
