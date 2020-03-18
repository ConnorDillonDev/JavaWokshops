package app;
 /**
  * PartTime
  */
 public class PartTime extends Student {

    int numberOfModules;

    public PartTime(String name, int numberOfModules) {
        super(name);
        this.numberOfModules = numberOfModules;
    }

    @Override
    public String toString() {
        return "Name : " + name + " Number of modules : " + numberOfModules; 
    }
 
     
 }