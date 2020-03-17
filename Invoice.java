import java.util.Scanner;
public class Invoice 
{
    private String partnumber;
    private String partdiscription;
    private int quantatity_of_P;
    private double price_per_item;
    Scanner obj = new Scanner(System.in);
    Invoice(String partnumber,String partdiscription,int quantatity_of_P,double price_per_item)
    {
        this.partnumber= partnumber;
        this.partdiscription=partdiscription;
        this.quantatity_of_P=quantatity_of_P;
        this.price_per_item=price_per_item;
    }
        public void getpartnumber()
        {
              System.out.println("Enter the  partnumber of the product");
              partnumber= obj.nextLine();
        }
        
         public String setpartnumber()
        {
              return partnumber  ;
        }
     
          public void getpartdiscription()
        {
              System.out.println("Enter the  partdiscription of the product");
             partdiscription= obj.nextLine();
        }
        
         public String setpartdiscription()
        {
              return partdiscription ;
        }

          public void getquantatity_of_P()
        {
              System.out.println("Enter the  quantatity_of_P of the product");
              quantatity_of_P= obj.nextInt();
        }
        
         public int setquantatity_of_P()
        {
              return quantatity_of_P ;
        }

           public void getprice_per_item()
        {
              System.out.println("Enter the  price_per_item of the product");
            price_per_item= obj.nextDouble();
        }
        
         public double setprice_per_item()
        {
              return price_per_item ;
        }


       
    
}