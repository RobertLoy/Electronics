
public abstract class Electronic {
	
	private double cost;
	private String manufacturer;
	private String model;
	private String type;
	private double totalData;
	private boolean hasWifi;
	private boolean isOn;
	
	public abstract void turnPowerOn();
	// If the device is On, turn it Off
	// If the device is Off, turn it On
	// Phones ask if you want to turn it off
	// Tablets do not ask
	
	public abstract void turnWifiOn(String network);
	// Phones can only connect to Verizon
	// Tablets can only connect to Sprint
	
	
	public abstract String visit(String url);
    // Can not download if power and wifi are off
	// Display messages for each of the URLs:
	   // ESPN.com = You are a sports fan!
	   // CNN.com = The news is not good!
	   // Weather.com = Clear and sunny forecast!
	   // Google.com = They are out to control the world!
	   // Apple.com = You need to visit the genius bar!
	// Phones can not visit Google.com
	// Tablet can not visit Apple.com
	
	
	public abstract double dataUsed(int numImages, String category);
    // Can not use data if power and wifi are off
	// Each sports image downloaded is 13.4MB;
	// Each flower image downloaded is 3.4MB;
	// Each vacation image downloaded is 45.7MB;
	// Each sports image downloaded is 13.4MB;
	// Phones download sizes are 1/2 the size
	// Tablets download sizes are twice the size
	
	// Object methods()
	public String higherPrice(Phone p, Tablet t) {
		
		// Change to return phone or tablet name
		return null;
	}
	
	public String higherData(Phone p, Tablet t) {
		
		// Change to return phone or tablet name
		return null;
	}	

	
	// Class Getter / Setter Methods
	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	
	public double getTotalData() {
		return this.totalData;
	}

	public void setTotalData(double usage) {
		this.totalData = usage;
	}	
		
}
