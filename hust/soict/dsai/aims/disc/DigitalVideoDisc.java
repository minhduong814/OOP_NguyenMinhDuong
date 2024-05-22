package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

	// Getter
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	} 
	public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
    public int getId() {
        return id;
    }
    
    //Setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}	
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }
    public void setId(int id) {
        this.id = id;
    }
    // Overloading
	public DigitalVideoDisc(String title) {
		this.title = title; 
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		this.category = category; 
		this.title = title; 
		this.cost = cost; 
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String director, String category, String title, int cost) {
		this.director = director; 
		this.category = category; 
		this.title = title; 
		this.cost = cost; 
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.director = director; 
		this.category = category; 
		this.title = title; 
		this.cost = cost; 
		this.length = length; 
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
	}

    @Override
    public String toString() {
        return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getLength() + ": " + this.getCost() + "$"; 
    }

    public boolean isMatch(String titleToCompare) {return this.getTitle().equalsIgnoreCase(titleToCompare);
    }
    
}
