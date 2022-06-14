public class Buyer
{
public static void main(String[] args)
{
PetrolBunk pb = new PetrolBunk();

System.out.println(pb.getPetrolPrice());
System.out.println(pb.getDieselPrice());
	
pb.getPetrolPrice(100);
pb.getDieselPrice(5.5f);
System.out.println(pb.getPetrolPrice());
System.out.println(pb.getDieselPrice());
}

}