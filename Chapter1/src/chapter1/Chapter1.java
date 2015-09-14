// Andrew Tannler
package chapter1;

public class Chapter1 {

    public static void main(String[] args) {

       byte small=(byte)3;
        System.out.println("small="+small);
       small=(byte)127;
        System.out.println("small="+small);
       small=(byte)128;
         System.out.println("small="+small);
       small=(byte)-128;
         System.out.println("small="+small);
       small=(byte)129;
        System.out.println("small="+small);
        System.out.println("");
        
        byte bobby=(byte)0xd6;
        int number=bobby&0x40;
        if(number==0)
            System.out.println("female");
        else
            System.out.println("male");
        System.out.println("");
        number=bobby&0x01;
        if(number==0)
            System.out.println("other transportation");
        else
            System.out.println("bus");
        System.out.println("");
        number=bobby&0x40;
        if(number==0)
            System.out.println("no sports");
        else
            System.out.println("sports");
        System.out.println("");
        number=bobby&0x80;
        if(number==0)
            System.out.println("cafeteria lunch");
        else
            System.out.println("home lunch");
        System.out.println("");
        
        double value=.1*8;
        double count=.1+.1+.1+.1+.1+.1+.1+.1;
        System.out.println(value);
        System.out.println(count);
        if(value==count)
            System.out.println("Values are the same");
        else
            System.out.println("Values are not the same");
        System.out.println("");
        final double DELTA=.00000000001;
        if(value+DELTA>count&&value-DELTA<count)
            System.out.println("Values are the same");
        else
            System.out.println("Values are not the same");
        System.out.println("");
        

        
        int x=3;
        int val=++x;
          System.out.println(val);
          System.out.println("");
          
          System.out.print("hello/n");
          System.out.println("");
          
          int num=5;
          if(val==4)
              if(num<7)
                  num=5;
          
          int numbers[]= {4,5,6,7,8,9};
          for(int i=0;i<numbers.length;i++)
            System.out.println(numbers[i]);
            System.out.println("===========");
            
            for(int numb:numbers)
            System.out.println(numb);
             System.out.println("");
           int twoD[][]={{3,4,5},
                         {2,14,25,6,2,3},
                         {9},
                         {0,-4,-5}};
           for(int r=0;r<twoD.length;r++)
           {
                    for(int i=0;i<twoD[r].length;i++)
                {
                    System.out.print(twoD[r][i]+" ");
                            System.out.println("");
                }
           }
 
    }
}
