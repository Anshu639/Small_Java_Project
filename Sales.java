package anshu;

public interface Sales {
    public String getName();

    public double calcCostPrice();

    public double calcSalesPrice();

    public double CalcProfit();

    //
    public static void printItemArray(Sales[] list) {
        for (Sales item : list) {
            System.out.println("Product name :" + item.getName());
            System.out.println("Product cost price is :" + item.calcCostPrice());
            System.out.println("Product sales price is :" + item.calcSalesPrice());
            System.out.println("Profit is :" + item.CalcProfit());
        }
    }
}




//    }
