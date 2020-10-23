class Main {
  public static void main(String[] args) {
    System.out.println("Hello Erik!");
    String x;
    String y;
    for (int i = 0; i<=200; i++)
    {
      x = divideableByFive(i);
      y = endsWithNine(i);
      System.out.println(i + x + y);
      sumAndModuloThree(i);
    }
  }

  public static String divideableByFive(int x)
  {
    String filter = "";
    if (x % 5 == 0 && x != 0)
      {
        filter = " ZAHL ist durch 5 teilbar!";
      }
      return(filter);
  }

  public static String endsWithNine(int x)
  {
    String filter = "";
    if (x % 10 == 9 && x != 0)
      {
        filter = " ZAHL ended auf 9!";
      }
      return(filter);
  }

  public static void sumAndModuloThree(int x)
  {
    if ((x + x-1) % 3 == 0 && x != 0)
      {
        System.out.println("| " + x + " und " + (x-1) + " ergeben " + (2*x-1) + " und " + (2*x-1) + " ist durch 3 teilbar");
      }
  }
}