package org.example;

import static org.example.Change.*;

/**
 * Algorithm : Get optimized change from payment. Use only $10 bill, $5 bill and $2 coin.
 * For 0, 1 or 3 dollars, throw an exception.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Algorithm : Get optimized change from payment!" );
        try {
            Change change = calculateChange(18);
            System.out.printf("Example for $18 : %s%n", change);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Change calculateChange(int payment) throws Exception {
        if (payment == 0 || payment == 1 || payment == 3) {
            throw new Exception("Error : Payment equals 0, 1 or 3. It can't be resolved.");
        }

        Change change = new Change();

        if (payment == 10 || payment == 12 || payment == 14 || payment == 15
                || payment == 16 || payment == 17 || payment == 18 || payment == 19
                || payment == 20 || payment == 21 || payment == 22 || payment == 23
                || payment == 24 || payment == 25 || payment == 26) {
            change.setNumBill10(payment/VALUE_BILL_10);
            payment -= change.getNumBill10()*VALUE_BILL_10;

            if ((payment == 1 || payment == 3)
                    && change.getNumBill10() > 0) {
                change.setNumBill10(change.getNumBill10()-1);
                payment += VALUE_BILL_10;
            }
        }

        if (payment == 5 || payment == 7 || payment == 9 || payment == 11 || payment == 13) {
            change.setNumBill5(1);
            payment -= VALUE_BILL_5;
        }

        change.setNumCoin2(payment / VALUE_COIN_2);

        return change;
    }
}
