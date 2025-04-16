import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> strings;
  public RandomStringChooser(String[] s) {
    strings = new ArrayList <String>();
    for(String str : s) {
      strings.add(str);
    }
  }
  public String getNext() {
    if(strings.size() == 0) {
      return "NONE";
    }
    int r = (int)(Math.random()*strings.size());
    return (strings.remove(r));
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
