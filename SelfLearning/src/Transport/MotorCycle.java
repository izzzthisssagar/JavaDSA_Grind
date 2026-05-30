package Transport;

public class MotorCycle extends Vehicle{

    public String handleBarStyle;

    public String suspensionType;


    public MotorCycle(String name,String model,int noOfTyres ,String handleBarStyle,String suspesnsionType)
    {
        super(name,model,noOfTyres);
        this.handleBarStyle=handleBarStyle;
        this.suspensionType =suspesnsionType;
    }

    public void Wheelie()
    {
        System.out.println("Motor Cycle is doing Wheelieee" + name );
    }


}
