package builder;

import java.util.ArrayList;

public class House {

	// TODO: write optional and mandatory facilities to have in a house
	private String location;
	private String heatingType;
	private int levels;

	//optional
	private int pool;
	private ArrayList<String> appliances;
	private String security;
	private String solarPanels;

	// TODO: complete the private constructor
	private House(HouseBuilder builder) {
		this.location = builder.location;
		this.heatingType = builder.heatingType;
		this.levels  = builder.levels;
		this.pool = builder.pool;
		this.appliances = builder.appliances;
		this.security = builder.security;
		this.solarPanels = builder.solarPanels;
	}

	// TODO: generate getters

	public String getSolarPanels() {
		return solarPanels;
	}

	public String getSecurity() {
		return security;
	}

	public ArrayList<String> getAppliances() {
		return appliances;
	}

	public int getPool() {
		return pool;
	}

	public int getLevels() {
		return levels;
	}

	public String getHeatingType() {
		return heatingType;
	}

	public String getLocation() {
		return location;
	}

	// TODO: override toString method

	@Override
	public String toString() {
		return "House{" +
				"location='" + location + '\'' +
				", heatingType='" + heatingType + '\'' +
				", levels=" + levels +
				", pool=" + pool +
				", appliances=" + appliances +
				", security='" + security + '\'' +
				", solarPanels='" + solarPanels + '\'' +
				'}';
	}

	public static class HouseBuilder {

		// TODO: write same facilities
		private String location;
		private String heatingType;
		private int levels;

		//optional
		private int pool;
		private ArrayList<String> appliances = new ArrayList<>();
		private String security;
		private String solarPanels;


		// TODO: complete the house builder constructor only with the mandatory facilities
		public HouseBuilder(String location, String heatingType, int levels) {
			this.location = location;
			this.heatingType = heatingType;
			this.levels = levels;
		}

		// TODO: add the optional facilities in a builder design
		public HouseBuilder pool(int pool) {
			this.pool = pool;
			return this;
		}

		public HouseBuilder appliance(String appliance) {
			this.appliances.add(appliance);
			return this;
		}

		public HouseBuilder security(String security) {
			this.security = security;
			return this;
		}

		public HouseBuilder solarPanels(String solarPanels) {
			this.solarPanels = solarPanels;
			return this;
		}

		// TODO: complete the final build method
		public House build() {
			return new House(this); // change this
		}

		// TODO: test functionality in a Main class


	}
}
