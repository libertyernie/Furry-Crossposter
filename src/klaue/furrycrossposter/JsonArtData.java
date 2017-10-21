package klaue.furrycrossposter;

public class JsonArtData {
	public String imagePath;
	public String thumbnailPath;
	public String title;
	public String description;
	public String[] tags;
	
	public class MatureLevel {
		public boolean moderate;
		public boolean explicit;
	}
	public MatureLevel nudity;
	public MatureLevel violence;
}
