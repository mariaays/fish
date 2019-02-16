package fish;
import java.util.Scanner;

public class Fish{
  String name;
  WaterType waterType;
  double maxSize;
  int minTankSize;
  int userTankSize;

  /** Initializes a new fish object with given parameters
    * @param name is the name of the fish species
    * @param waterType is the species' water type (e.g saltwater, brackish, freshwater)
    * @param maxSize is the species' max size in inches
    * @param minTankSize is the minimum tank size required for this species, in gallons
  */
  public Fish(String name, WaterType waterType, double maxSize, int minTankSize){
    this.name = name;
    this.waterType = waterType;
    this.maxSize = maxSize;
    this.minTankSize = minTankSize;
  }

  /**A nice representation of a fish object */
  @Override
  public String toString(){
    return this.name + " [watertype: " + this.waterType + ", maxSize: " + this.maxSize + ", minTankSize: " + this.minTankSize + "]";
  }

  /** getter for the water type
    *@return the water type
  */
  public WaterType getType(){
    return waterType;
  }

  /** getter for the species name
    *@return the species name
  */
  public String getName(){
    return name;
  }

  /** getter for the species max size, in inches
    *@return the max size
  */
  public double getFishSize(){
    return maxSize;
  }
  /** getter for the minimum aquarium size, in gallons
    *@return the tank size
  */
  public int getMinTankSize(){
    return minTankSize;
  }
  /** Checks if two fish are compatible given their waterType
    * will be updated to check multiple fish
    * will be updated to consider fish size and tank size
    * will be updates to consider water temperature
    * @param fish1 is the first fish being compared
    * @param fish2 is the second fish being compared
    * @return true if fish are compatible, false if not
  */
  public static boolean isCompatible(Fish fish1, Fish fish2, int userTankSize){
    if(fish1.getType().equals(fish2.getType()) && fish1.getMinTankSize() < userTankSize && fish2.getMinTankSize() < userTankSize){return true;}
    return false;
  }

}
