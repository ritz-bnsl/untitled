package test;

public class Ledstrip {
    private Led[] ledstrip;

    private int lengthOfStrip() {
        return ledstrip.length;
    }
     private int numberOfDefectiveLEDs(){
        int counter=0;
         for (Led led : ledstrip) {
             if(!led.isWorking()){
                 counter++;
             }
         }
         return counter;
    }

     private boolean isStripDefective(){
        return numberOfDefectiveLEDs()> (lengthOfStrip()/2);
     }
     public void printStripStatus(){
        if(isStripDefective()==false){
            System.out.println("This strip is not defective!");
        }
        else {
            System.out.println("This strip is defective!");
        }
     }

    public Ledstrip(Led[] Ledstrip){
        this.ledstrip=Ledstrip;
    }

    public Led[] getLedstrip() {
        return ledstrip;
    }

    public void setLedstrip(Led[] ledstrip) {
        this.ledstrip = ledstrip;
    }
}
