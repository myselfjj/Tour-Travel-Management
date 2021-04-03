import java.util.Scanner;
abstract class Destinations{
    Scanner s=new Scanner(System.in);
    abstract void manali();
    abstract void package_manali();
    abstract void goa();
    abstract void package_goa();

}
abstract class Manali extends Destinations{
    int c;
    void manali(){
        System.out.println("Location: Manali");
     }
    void package_manali(){
        System.out.println("Choose Package: ");
        System.out.println("1) 1 Night/2 Days");
        System.out.println("2) 2 Night/3 Days");
        System.out.println("3) 3 Night/4 Days");
        c=s.nextInt();
        System.out.println("\n-------------------------------------------------------------------------------\n");
        switch(c){
            case 1:
                System.out.println("Location: Manali");
                System.out.println("Price: Rs 999");
                System.out.println("Stay: 1 Nights/2 days");
                System.out.println("Hotel  Category: Restraurant");
                break;
            case 2:
                 System.out.println("Location: Manali");
                System.out.println("Price: Rs 1999");
                System.out.println("Stay: 2 Nights/3 days");
                System.out.println("Hotel  Category: Special Tambu");
                break;
            case 3:
                System.out.println("Location: Manali");
                System.out.println("Price: Rs 2999");
                System.out.println("Stay: 3 Nights/4 days");
                System.out.println("Hotel  Category: 5 Star");
                break;
            default: System.out.println("Wrong Choice");
            break;
       
        }
        System.out.println("\n-------------------------------------------------------------------------------\n");
        System.out.println("Do you want to Customize current package. Enter y for YES, n for NO: ");
        char ch=s.next().charAt(0);
        if(ch=='y'){
            System.out.println("------------------------Customized Package:--------------------------------");
            if(c==1){
                System.out.println("Enter No. of nights you want to extend. Rs 200/Night: ");
                int n=s.nextInt();
                int p=999+(n*200);
                System.out.println("Location: Manali");
                System.out.println("Price: Rs "+p);
                System.out.println("Stay: "+(n+1)+" Nights/"+(n+2)+" days");
                System.out.println("Hotel  Category: Restraurant");
            }
            else if(c==2){
                System.out.println("Enter No. of nights you want to extend. Rs 500/Night: ");
                int n=s.nextInt();
                int p=1999+(n*500);
                System.out.println("Location: Manali");
                System.out.println("Price: Rs "+p);
                System.out.println("Stay: "+(n+2)+" Nights/"+(n+3)+" days");
                System.out.println("Hotel  Category: Special Tambu");
            }
            else{
                System.out.println("Enter No. of nights you want to extend. Rs 800/Night: ");
                int n=s.nextInt();
                int p=2999+(n*800);
                System.out.println("Location: Manali");
                System.out.println("New Price: Rs "+p);
                System.out.println("Stay: "+(n+3)+" Nights/"+(n+4)+" days");
                System.out.println("Hotel  Category: 5 Star");
            }
            

        }
        System.out.println("----------------------Thank You For Visiting us!!----------------------------------");
        

    }
}

class Goa extends Manali{
    int c;
    void goa(){
        System.out.println("Location: Goa");
    }
    void package_goa(){
        System.out.println("Choose Package: \n");
        System.out.println("1) 1 Night/2 Days");
        System.out.println("2) 2 Night/3 Days");
        System.out.println("3) 3 Night/4 Days");
        c=s.nextInt();
        System.out.println("\n-------------------------------------------------------------------------------\n");
        switch(c){
            case 1:
                 System.out.println("Location: Goa");
                System.out.println("Price: Rs 1999");
                System.out.println("Stay: 1 Nights/2 days");
                System.out.println("Hotel  Category: Restraurant");
                break;
            case 2:
                System.out.println("Location: Goa");
                System.out.println("Price: Rs 2999");
                System.out.println("Stay: 2 Nights/3 days");
                System.out.println("Hotel  Category: 3 Star");
                break;
            case 3:
                System.out.println("Location: Goa");
                System.out.println("Price: Rs 4999");
                System.out.println("Stay: 3 Nights/4 days");
                System.out.println("Hotel  Category: Yort");
                break;
            default: System.out.println("Wrong Choice");
            break;
       
        }
        System.out.println("\n-------------------------------------------------------------------------------\n");
        System.out.println("Do you want to Customize current package. Enter y for YES, n for NO: ");
        char ch=s.next().charAt(0);
        if(ch=='y'){
            System.out.println("------------------------Customized Package:----------------------------------\n");
            if(c==1){
                System.out.println("Enter No. of nights you want to extend. Rs 400/Night: ");
                int n=s.nextInt();
                int p=1999+(n*400);
                System.out.println("Location: Goa");
                System.out.println("Price: Rs "+p);
                System.out.println("Stay: "+(n+1)+" Nights/"+(n+2)+" days");
                System.out.println("Hotel  Category: Restraurant");
            }
            else if(c==2){
                System.out.println("Enter No. of nights you want to extend. Rs 800/Night: ");
                int n=s.nextInt();
                int p=2999+(n*800);
                System.out.println("Location: Goa");
                System.out.println("Price: Rs "+p);
                System.out.println("Stay: "+(n+2)+" Nights/"+(n+3)+" days");
                System.out.println("Hotel  Category: 3 Star");
            }
            else{
                System.out.println("Enter No. of nights you want to extend. Rs 1500/Night: ");
                int n=s.nextInt();
                int p=4999+(n*1500);
                System.out.println("Location: Goa");
                System.out.println("New Price: Rs "+p);
                System.out.println("Stay: "+(n+3)+" Nights/"+(n+4)+" days");
                System.out.println("Hotel  Category: Yort");
            }
        }
       
        System.out.println("\n----------------------Thank You For Visiting us!!----------------------------------");
        

    }
}

class TourTravel{

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        boolean ch=true;
        System.out.println("----------------------Welcome to Pandey's Tour and Travel Agency-------------------\n");
        System.out.println("Available Packages: 1) Manali 2) Goa \n");
        System.out.println("Enter 1 for Manali and 2 for Goa: ");
        int c=s.nextInt();
        Goa obj=new Goa();
        
        while(ch==true)
        if(c==1){
            obj.manali();
            obj.package_manali();
            ch=false;
        }
        else if(c==2){
            obj.goa();
            obj.package_goa();
            ch=false;
        }
        else{
            System.out.println("Wrong Choice. Try again!");
        }
    }
}