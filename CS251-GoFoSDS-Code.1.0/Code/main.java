package GOFO;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<PlayGround> Playgrounds = new ArrayList<PlayGround>();
        while(true){
            System.out.println("Do you want to sign up? \n Enter 1 if yes or enter 0 for exit");
            Scanner input= new Scanner(System.in);
            int choose1 = input.nextInt();
            input.nextLine();
            if(choose1==1)
            {
                System.out.println("Are you\n 1)Player \n 2)Playground owner?");
                int choose2=input.nextInt();
                input.nextLine();
                if(choose2==1)
                {
                    Player object = new Player();
                    object.register();
                    System.out.println("1-Display all playgrounds \n 2- booking");
                    int choose4=input.nextInt();
                    input.nextLine();
                    if(choose4==1)
                    {
                        object.displayData(Playgrounds);

                    }
                    else
                        object.Booking(Playgrounds);
                }
                else
                {
                    Owner object =new Owner();
                    object.register();
                    System.out.println("Do you want to add your playground?\n Enter 1 if yes or 0 if else ");
                    int choose3=input.nextInt();
                    input.nextLine();
                    if(choose3==1) {
                        PlayGround pg = new PlayGround();
                        String Name;
                        String location;
                        String Size;
                        double starth;
                        double endh;
                        int PricePerHour;
                        String cancellationHour;
                        System.out.println(" Enter your Playground Name, location ," +
                                "cancellationHour,Size,The stat of avaliable Hour,The end of avaliable Hour,and PricePerHour in order");
                        Name = input.nextLine();
                        pg.setName(Name);

                        location = input.nextLine();
                        pg.setlocation(location);

                        cancellationHour = input.nextLine();
                        pg.setcancellationHour(cancellationHour);

                        Size = input.nextLine();
                        pg.setSize(Name);

                        starth=input.nextDouble();
                        pg.setStartH(starth);

                        endh=input.nextDouble();
                        pg.setEndH(endh);

                        PricePerHour = input.nextInt();
                        pg.setPricePerHour(PricePerHour);
                        Playgrounds.add(pg);
                    }
                    else
                        return;
                }


            }
            else
            {
                return;
            }
        }

    }
}
