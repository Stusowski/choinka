import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Podaj długość choinki: ");
    int d = in.nextInt();
    for(int i=0; i<d; i++){
      for(int j=0; j<d-i; j++){
        System.out.print(" ");
      }
      for(int k=0; k<i*2+1; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}