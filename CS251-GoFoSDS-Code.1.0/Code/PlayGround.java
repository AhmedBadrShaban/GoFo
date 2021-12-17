package GOFO;

public class PlayGround {
    private
    String Name;
    String location;
    double startH;
    double endH;
    String Size;
    int PricePerHour;
    String cancellationHour;

    public PlayGround() {
    }

    PlayGround(String Name, String location, double startH,double endH, String Size, int PricePerHour, String cancellationHour) {
        this.Name = Name;
        this.location = location;
        this.startH=startH;
        this.endH=endH;
        this.Size = Size;
        this.PricePerHour = PricePerHour;
        this.cancellationHour = cancellationHour;
    }

    /*void register() {
        String Data[] = new String[5];
        System.out.println("Please enter your Playground Name,location ,avaliableHour,cancellationHour,and Size in order");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String data = input.nextLine();
            Data[i] = data;
        }
        System.out.println("Please enter the Price Per hour");
        int Size = input.nextInt();
    }*/



    void setStartH( double statH)
    {
        this.startH=statH;
    }
    double getStartH()
    {
        return startH;
    }
    void setEndH( double engH)
    {
        this.endH=engH;
    }
    double getEndH()
    {
        return endH;
    }
    void setName(String name)
    {
        this.Name=name;
    }
    String getName()
    {
        return this.Name;
    }
    void setlocation(String location)
    {
        this.location=location;
    }
    String getLocation()
    {
        return location;
    }
    void setSize(String Size)
    {
        this.Size=Size;
    }
    String getSize()
    {
        return Size;
    }
    void setcancellationHour(String cancellationHour)
    {
        this.cancellationHour=cancellationHour;
    }
    String getcancellationHour()
    {
        return cancellationHour;
    }
    void setPricePerHour(int PricePerHour)
    {
        this.PricePerHour=PricePerHour;
    }
    int getPricePerHour() {
        return PricePerHour;

    }
    @Override
    public String toString() {
        return "playgrounds"+"[name: "+this.getName()+"location: "+this.getLocation()+"StartHour: "+this.getStartH()+"EndHour"+this.getEndH()+"Size: "+this.getSize()+
                "PricePerHour: "+this.getPricePerHour()+ "cancellationHour: "+this.getcancellationHour()+
                +']';
    }



    }
