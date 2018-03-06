package klaue.furrycrossposter;

import java.util.Base64;

public class JsonArtData {
	public String data; // base64
	public String title;
	public String description;
	public String[] tags;
	
	public boolean mature;
	public boolean adult;
	
	// optional / deprecated
	public String imagePath;
	public String thumbnailPath;
	
	public byte[] getData() {
		return Base64.getDecoder().decode(data);
	}
}
