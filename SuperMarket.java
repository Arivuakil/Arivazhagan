public class SuperMarket
{
static String name = "ARIVAZHAGAN SUPERMARKET";
int mrp;
public static void main(String [] args)
{
System.out.println(name);
name = "AKIL SUPERMARKET";
System.out.println(name);
SuperMarket soap = new SuperMarket();
soap.mrp = 15;
SuperMarket rice = new SuperMarket();
rice.mrp = 50;
SuperMarket cake = new SuperMarket();
cake.mrp = 20;
}
}