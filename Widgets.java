package anshu;

import java.util.Scanner;

public class Widgets implements Sales{
    private String name="Widgets";
    private double costPrice;
    private double salesPrice;

//    @Override
//    public void getInput() {
//
//    }

    private double quantity;

    public Widgets() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your cost price value ");
        costPrice= sc.nextDouble();
        System.out.println("Enter your sales price value ");
        salesPrice= sc.nextDouble();
        System.out.println("Enter your quantity ");
        quantity= sc.nextDouble();

        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcCostPrice() {
        return costPrice * quantity;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice * quantity;
    }

    @Override
    public double CalcProfit() {
        return calcSalesPrice() - calcCostPrice();
    }
}

