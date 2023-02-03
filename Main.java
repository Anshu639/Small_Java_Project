package anshu;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products:-");
        int num = sc.nextInt();
        Sales[] list = new Sales[num];
        for(int i=0;i<num;i++) {
//        Sales.printItemArray(list);
            System.out.println("what you want to purchase enter your case");
            System.out.println("Press 1 for Crushed_Rock \nPress 2 for \nPress 3 for Widgets");
            System.out.println("Please enter your Product no:-");
            int number = sc.nextInt();
              switch (number) {
                case 1:
                    System.out.println("Crushed rock");
                     list[i] = new Crushed_Rock();
                        break;
               case 2:
                    System.out.println("Red paint");
                    list[i] = new Red_Paint();
                    break;
                case 3:
                    System.out.println("Widgets");
                    list[i] = new Widgets();
                    break;
                default:
                    System.out.println("invalid number");
            }
        }
        Sales.printItemArray(list);
    }
}



//       Crushed_Rock c1 = new Crushed_Rock(10,12,50);
//        System.out.println("Cost Price is :-"+c1.calcCostPrice());
//        System.out.println("Sales Price is :-"+c1.calcSalesPrice());
//        System.out.println("Profit :-"+c1.CalcProfit());
//
//       Red_Paint r1 = new Red_Paint(10,12,50);
//        System.out.println("Cost Price is :-"+r1.calcCostPrice());
//        System.out.println("Sales Price is :-"+r1.calcSalesPrice());
//        System.out.println("Profit :-"+r1.CalcProfit());
//
//        Widgets w1 = new Widgets(10,12,50);
//         System.out.println("Cost Price is :-"+w1.calcCostPrice());
//         System.out.println("Sales Price is :-"+w1.calcSalesPrice());
//         System.out.println("Profit :-"+w1.CalcProfit());

