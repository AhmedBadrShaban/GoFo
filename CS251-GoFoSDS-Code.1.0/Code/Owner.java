package GOFO;

import java.util.Scanner;

public class Owner {

    private
    String Name;
    String phone;
    String email;
    String password;
    public
    Owner(){}
    Owner(String Name,String phone,String email,String password)
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
        Scanner input= new Scanner(System.in);
        for(int i =0;i<4;i++)
        {
            String data=input.nextLine();
            Data[i]=data;
        }

    }

}
