//Incresing Number Pattern Program
public class IncreaseNumber
  {
    public static void main(String[] args)
    {
      int num=1;
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              Syatem.out.print(num + " ");
              num++;
            }
          System.out.println();
        }
    }
  }
