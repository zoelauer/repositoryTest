
package chickenonezl;
 
public class ChickenOneZL {
    
    
    public static void main(String[] args) {
        //chicken egg count
        
        //variables
        int totalEggs = 0;
        int chickenCount = 3;
        int eggsPerChicken = 5;
        
        String dayOfWeek = "Monday";
        String labelOne = " Farmer Brown's chicken number: ";
        String labelTwo = " Farmer Brown's eggs number: ";
        String frontEndLabel = "On ";
        
        //Monday eggs
        //Egg calculation
        totalEggs = chickenCount * eggsPerChicken;
        
        //print answer
        System.out.println(frontEndLabel + dayOfWeek + labelOne 
                + chickenCount + labelTwo + totalEggs);
        
        //Tuesday
        dayOfWeek = "Tuesday";
        chickenCount++;
        
        //Egg calculation
        totalEggs = chickenCount * eggsPerChicken;
        
        //Print answer
        System.out.println(frontEndLabel + dayOfWeek + labelOne
                + chickenCount + labelTwo + totalEggs);
        
        
        //Wednesday eggs
        dayOfWeek = "Wednesday";
        chickenCount = chickenCount/2;
     
        //Egg calculatoin
        totalEggs = chickenCount * eggsPerChicken;
        
        //Print Answer
        System.out.println (frontEndLabel + dayOfWeek + labelOne
        + chickenCount + labelTwo + totalEggs);
        
        //Starts with pt 1
        dayOfWeek = "Saturday";
        chickenCount++;
        eggsPerChicken = 5;
        
        //Egg calculation
        totalEggs = chickenCount * eggsPerChicken;
        
        //Print Answer
        System.out.println (frontEndLabel + dayOfWeek + labelOne
        + chickenCount + labelTwo + totalEggs);
        
        //Starts with pt 1
        dayOfWeek = "Sunday";
        chickenCount++;
        eggsPerChicken = 4;
        
        //Egg calculation
        totalEggs = chickenCount * eggsPerChicken;
        
        //Print Answer
        System.out.println (frontEndLabel + dayOfWeek + labelOne
        + chickenCount + labelTwo + totalEggs);
        
    }
    
}
