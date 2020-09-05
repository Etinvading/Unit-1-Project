import java.util.Scanner;

public class HeatEnergyRunner {
    
    public static void main(String[] args){
        
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter in the mass of the water, in grams");
    double mass = reader.nextDouble();
    System.out.println("Enter the initial temperature, in Celsius");
    double initialtemp = reader.nextDouble();
    if (initialtemp < -273.14)
        initialtemp = -273.14;
    System.out.println("Enter the final temperature, in Celsius");
    double finaltemp = reader.nextDouble();
    if(finaltemp < -273.14;
        finaltemp = -273.14;
        
    System.out.println("Mass:"+mass"g");
    System.out.println("intial temperature+ intialtemp+ "C");
    System.out.println("final temperature" + finaltemp + "C")
    
    String initialphase = "gas";
        String finalphase = "gas";
        String phase = iniialphase;
        if (initialtemp < 0) {
            initialphase = "solid";
            }
        if (initialtemp >= 0 && initialtemp <= 100) {
            initialphase = "liquid";
            initialtemp = "liquid";
            
    public static double tempChangeSolid(double mass, double startTemp, double endTemp, String endPhase, boolean endothermic)
    if (lendPhase.equals("solid"))
        endTemp=0;
    double energyChange = mass*0.002108*(endTemp - startTemp);
    if(endothermic)
        System.out.println("Heating (solid): " + energyChange + "kJ");
    else
        System.out.println("Cooling (solid): "+ energyChange + "kJ);
    return energyChange;
        energyChange = 0.33*mass;
        System.out.print("Melting: " +energyChange + "kJ);
    }
    else{
        energyChange = -0.333*mass;
        System.out.print("Freezing: " + energyChange + "kJ");
    }
    return energyChange;
}

public static double vaporization(double mass, boolean endothermic){
        double energyChange;
        if(endothermic){
            energyChange = 2.257*mass;
            System.out.print("Evaporation: " + energyChange + "kJ");
        }
        else{
                energyChange = -2.257*mass;
                System.out.print("COndensation: " + energyChange + "kJ);
            }
            return energyChange;
        }
        public static double round(double x)
            x*=1000;
            if(x>0)
                return (int)(x+0.5)/1000.0;
            else
                return (int)(x-0.5)/1000;
        }
}



