import java.io.PrintStream;

public class lab04
{
  public static void main(String[] paramArrayOfString)
  {
    SortedList localSortedList = new SortedList();
    for (int i = 0; i < 100; i++) {
      localSortedList.insert(Math.random());
    }
    System.out.println("\n\nNumbers in ascending order\n");
    localSortedList.listAscending();
    System.out.println("\n\nNumbers in descending order\n");
    localSortedList.listDescending();
  }
}