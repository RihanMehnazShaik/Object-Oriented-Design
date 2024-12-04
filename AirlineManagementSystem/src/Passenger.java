public class Passenger {
    private String name;
    private String phoneNumber;
    private String Id;

    public Passenger(String name, String phoneNumber, String Id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return Id;
    }

    public boolean equals(Object ob){
        if(this==ob) return true;
        if(ob==null || getClass()!=ob.getClass()) return false;
        Passenger passenger=(Passenger) ob;
        return Id.equals(passenger.getId());
    }
    public int hashCode(){
        return Id.hashCode();
    }
}
