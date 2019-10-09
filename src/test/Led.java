package test;
import java.util.Scanner;
public class Led {
    private  String colourName;
    private  boolean working;

    public String getColourName() {
        return colourName;
    }

    public boolean isWorking() {
        return working;
    }

    public void setColourName(String colour_Name) {
        this.colourName = colour_Name;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
   public Led(String colourName,boolean working) {
        this.colourName = colourName;
        this.working = working;
    }
}
