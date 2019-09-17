package lab1homework;

public class House {
	protected int id;
	protected float price;
	protected String location, advertiser;
	protected Photo image;
	
	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public House(int id, float price, String location, String advertiser, Photo image) {
		super();
		this.id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	}
	
	public House(House other) {
		this.id = other.id;
		this.price = other.price;
		this.location = other.location;
		this.advertiser = other.advertiser;
		this.image = other.image;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getAdvertiser() {
		return advertiser;
	}
	
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
	
	public Photo getImage() {
		return image;
	}
	
	public void setImage(Photo image) {
		this.image = image;
	}

	//@Override
	//public String toString() {
	//	return "House [id=" + id + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser + ", image=" + image + "]";
	//}

	@Override
	public String toString() {
		return id + "\t" + price + "\t" + location + "\t" + advertiser + "\t" + image + "\n";
	}
}
