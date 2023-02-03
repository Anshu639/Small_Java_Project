package anshu;

import java.util.Scanner;

public class Crushed_Rock implements  Sales {
    private String name="Crushed rock";
    private double costPrice;
    private double salesPrice;
    private double pounds;


    public Crushed_Rock() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your cost price value ");
        costPrice= sc.nextDouble();
        System.out.println("Enter your sales price value ");
        salesPrice= sc.nextDouble();
        System.out.println("Enter your quantity ");
        pounds= sc.nextDouble();

        this.costPrice = costPrice;
        this.salesPrice = salesPrice;
        this.pounds = pounds;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcCostPrice() {
        return costPrice * pounds;
    }

    @Override
    public double calcSalesPrice() {
        return salesPrice * pounds;
    }

    @Override
    public double CalcProfit() {
        return calcSalesPrice() - calcCostPrice();
    }

}
