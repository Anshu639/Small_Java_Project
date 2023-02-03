package anshu;

import java.util.Scanner;

public class Red_Paint implements Sales{
    private String name="Red paint";
    private double costPrice;
    private double salesPrice;
    private double gallons;

    public Red_Paint() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your cost price value ");
        costPrice= sc.nextDouble();
        System.out.println("Enter your sales price value ");
        salesPrice= sc.nextDouble();
        System.out.println("Enter your quantity ");
        gallons= sc.nextDouble();

        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
        this.gallons = gallons;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcCostPrice() {
        return costPrice * gallons;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice * gallons;
    }

    @Override
    public double CalcProfit() {
        return calcSalesPrice() - calcCostPrice();
    }
}


