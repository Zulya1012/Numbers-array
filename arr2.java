import java.util.Scanner;
public class arr2 {
  public static void main(String[] arg) {
    int[] a;
    int b;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter numbers of erray:");
    b = sc.nextInt();
    a = new int[b];
    for (int i = 0; i < b; i++) {
      System.out.print("Enter a[" + i + "] =");
      a[i] = sc.nextInt();
    }
  }
}
