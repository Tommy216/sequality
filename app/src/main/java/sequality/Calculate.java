package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(double a, double b) {
    return a / b;
  }

  public int sum2(int X, int Y) {
    int allsum = 0;
    for (int i = X; i <= Y; i++) {
      allsum += i;
    }
    return allsum;
  }

  public int sum3(int X, int Y, int Z) {
    int oddsum = 0, evensum = 0;
    for (int i = X; i <= Y; i++) {
      if (i % 2 == 0) {
        oddsum += i;
      } else {
        evensum += i;
      }
    }
    if (Z % 2 == 1) {
      return oddsum;
    } else {
      return evensum;
    }
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.printf("Sum of 2 and 3 is %d .", new App().sum(2, 3));
    System.out.printf("Average is %.1f .\n", new App().ave(new App().sum(2, 3), 2));
    System.out.printf("Sum of 1 to 10 is %d .", new App().sum2(1, 10));
    System.out.printf("Average is %.1f .\n", new App().ave(new App().sum2(1, 10), 10));
    System.out.printf("Sum of odd 1 to 10 is %d . Sum of even is %d .\n", new App().sum3(1, 10, 2),
        new App().sum3(1, 10, 1));
  }
}
