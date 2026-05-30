package Transport;

public class Car extends Vehicle
{
    public int noOfDoors;

    public String transmissionType;

    public Car(String name , String model,int noOfTyres , int noOfDoors , String transmissionType )
    {
        super(name,model,noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        //super.StartEngine();

    }
    public void StartAc()
    {
        System.out.println("Start Ac of "+ name );
    }


}
