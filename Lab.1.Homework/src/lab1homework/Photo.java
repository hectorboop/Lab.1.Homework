package lab1homework;

public class Photo {
	private String quality, type;

	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Photo(String quality, String type) {
		super();
		this.quality = quality;
		this.type = type;
	}
	
	public Photo(Photo other) {
		this.quality = other.quality;
		this.type = other.type;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//@Override
	//public String toString() {
	//	return "Photo [quality=" + quality + ", type=" + type + "]";
	//}
	
	@Override
	public String toString() {
		return quality  + "\t" + type;
	}
}
