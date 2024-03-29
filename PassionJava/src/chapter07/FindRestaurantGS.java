package chapter07;

public class FindRestaurantGS {
	String name;
	String category;
	String location;
	int michelinStar;
	int openTime;
	int lastOrder;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMichelinStar() {
		return michelinStar;
	}
	public void setMichelinStar(int michelinStar) {
		this.michelinStar = michelinStar;
	}
	public int getOpenTime() {
		return openTime;
	}
	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}
	public int getLastOrder() {
		return lastOrder;
	}
	public void setLastOrder(int lastOrder) {
		this.lastOrder = lastOrder;
	}
	
	@Override
	public String toString() {
		return "FindRestaurantGS [name= " + name + 
				", category= " + category + ", location= " + location + 
				", michelinStar= " + michelinStar + 
				", openTime= " + openTime + ", lastOrder= " + lastOrder + "]" ;
	}
	
	public static void main(String[] args) {
		FindRestaurantGS f1 = new FindRestaurantGS();
		f1.setName("게방식당");
		f1.setCategory("한식");
		f1.setLocation("서울 강남구");
		f1.setMichelinStar(1);
		f1.setOpenTime(11);
		f1.setLastOrder(7);
		System.out.println(f1.toString());
	}

}
