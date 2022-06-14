public class Citizen implements Rules
{
public static void main(String[] args)
{
Citizen c = new Citizen();
c.getPassport();
c.getVisa();
c.haveMoney();
}
public void getPassport(){System.out.println("Passport");}
public void getVisa(){System.out.println("Visa");}
public void haveMoney(){System.out.println("Money");}

}