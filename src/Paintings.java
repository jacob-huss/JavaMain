public class Paintings {
    // Properties
    private String name;

    private String medium;

    private String size;

    private int date;

    private boolean original;

    


    // empty constructor
    public Paintings() {
    };

    public boolean original() {
        return true; 
    }
    public String speech(String gift) {
		
		return "I want to thank everyone by giving you all a " + gift + " to show my gratitude for your help and support!";
	}

    // getter and setters for instances

    public boolean isOriginal() {
        return original;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 2 variable constructor

    // public Paintings(String name, String medium) {
    // this.setName(name);
    // this.setMedium(medium);
    // }

    // 4 variable constructor

    public Paintings(String name, String medium, String size, int date) {
        this.setName(name);
        this.setMedium(medium);
        this.setSize(size);
        this.setDate(date);

    }
    // boolean return method
    

}