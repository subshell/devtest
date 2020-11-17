public class Postleitzahl {
    int plz;
 
    public Postleitzahl(int plz) {
        this.plz = plz;
    }
 
    public int getValue(){
        return plz;
    }
 
    public void setPLZ(int zipcode) {
    this.plz=zipcode;
    }
 
    @Override
    public String toString()
    {
        return new String(""+plz);
    }
}