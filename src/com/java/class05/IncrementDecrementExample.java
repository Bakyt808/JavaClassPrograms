package com.java.class05;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int numberOfClients = 0;

        numberOfClients++;
        System.out.println(numberOfClients);

        numberOfClients--;
        System.out.println(numberOfClients);


        double gasPrice = 3.99;
        gasPrice++; //gasPrice = gasPrice + 1.0
        System.out.println(gasPrice);

        double gasPriceAfterTax = gasPrice++;
        System.out.println(gasPriceAfterTax);

        int z = 10;
        int r = z++;
        System.out.println(r);
        System.out.println(z);

        int u = 11;
        int q = u++;
        int t = q++;

        System.out.println(u);
        System.out.println(q);
        System.out.println(t);

        int ab = 50;
        int ac = ab++;
        int ad = ++ab;
        System.out.println(ad++);
        System.out.println(++ab);

        int var1 = 20;
        System.out.println(var1++);
        System.out.println(++var1);



    }
}
