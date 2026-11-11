package leadertypes;

//Superclass
public abstract class Leader {
    private String name;
    private String country;
    private int yearsInPower;

    public Leader(String name, String country, int yearsInPower) {
        setName(name);
        setCountry(country);
        setYearsInPower(yearsInPower);
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name required");
        }
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country != null || country.isBlank()) {
            throw new IllegalArgumentException("Country required");
        }
        this.country = country;
    }


    public int getYearsInPower() {
        return yearsInPower;
    }

    public void setYearsInPower(int yearsInPower) {
        if (yearsInPower >= 0) {
            this.yearsInPower = yearsInPower;
        } else {
            System.out.println("Invalid number.");
        }
    }

    public boolean isValid() {
        return name != null && country != null && yearsInPower >= 0;
    }


    public abstract void giveSpeech();

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in power: " + yearsInPower);
    }
}
