package GOFO;
import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    private
    String Name;
    String phone;
    String email;
    String password;
    double startH;
    double endH;
    public
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
    Scanner input= new Scanner(System.in);
    Player(){}

    Player(String Name,String phone,String email,String password)
    {
        this.Name=Name;
        this.phone=phone;
        this.email=email;
        this.password=password;
    }
    void register()
    {
        String Data[]=new String[4];
        System.out.println("Please enter your Name,Phone ,Email,and Password in order");
        for(int i =0;i<4;i++)
        {
            String data=input.nextLine();
            Data[i]=data;
        }

    }
    double CalcTotalPrice(double x,double y,PlayGround obj)
    {
         double NumHour=y-x;
         return  NumHour*obj.getPricePerHour();

    }

    public void displayData(ArrayList<PlayGround> arraylist)
    {
        for(int i =0;i<arraylist.size();i++)
        {
            System.out.println(arraylist.get(i));
        }
    }

    void book(String name, String hours, int numHours){
        System.out.println("Please enter playground Name, hours to be booked in order");

    }
    boolean CheckHours( double x,double y ,PlayGround obj )
    {
        if(x >= obj.getStartH()&& y <= obj.getEndH())
            return true;
        else
            return false;
    }

    void Booking(ArrayList<PlayGround> arraylist)
    {
        for(int i=0;i<arraylist.size();i++)
        {
            System.out.println(arraylist.get(i).toString()+" ");
            System.out.println("===============");
        }
        System.out.println("enter the number of the playground ");
        int indx=input.nextInt();
        indx--;
        System.out.println("AvaliableTime");
        System.out.println(arraylist.get(indx).getStartH()+" ");
        System.out.println(arraylist.get(indx).getEndH()+" ");
        System.out.println("enter Your time  ");
        double start=input.nextDouble();
        double end=input.nextDouble();
        this.setStartH(start);
        this.setEndH(end);
        //System.out.println("take care that the time is not in isReserved ");

        if(this.CheckHours(start,end,arraylist.get(indx)))
        {

            System.out.println("Done");
            System.out.println( this.CalcTotalPrice(start,end,arraylist.get(indx)));

        }
        else
            System.out.println("You can't booking");
    }

}

