public class Staff extends Person{
    private String OfficeLocation;
    private String position;

    public String getOfficeLocation() {
        return OfficeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        OfficeLocation = officeLocation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
