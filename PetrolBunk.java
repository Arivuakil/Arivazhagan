public class PetrolBunk
{
private int petrolPrice = 110;
private float dieselPrice = 100.0f;

public void setPetrolPrice(int val)
{
this.petrolPrice = this.petrolPrice-val;
}
public void setDieselPrice(float val)
{
this.dieselPrice = this.dieselPrice-val;
}
}