package org.example.changefromautomaticcash;

import static org.example.changefromautomaticcash.Change.*;

/**
 * Algorithm : Get optimized change from payment. Use only $10 bill, $5 bill and $2 coin.
 * For 0, 1 or 3 dollars, throw an exception.
 */
public class AutomaticCash {
    public static Change calculateChange(int payment) throws Exception {
        if (payment == 0 || payment == 1 || payment == 3) {
            throw new Exception("Error : Payment equals 0, 1 or 3. It can't be resolved.");
        }

        Change change = new Change();

        if (payment >= 10) {
            change.setNumBill10(payment / VALUE_BILL_10);
            payment -= change.getNumBill10() * VALUE_BILL_10;

            if ((payment == 1 || payment == 3)
                    && change.getNumBill10() > 0) {
                change.setNumBill10(change.getNumBill10() - 1);
                payment += VALUE_BILL_10;
            }
        }

        if ((payment - 5) % 2 == 0) {
            change.setNumBill5(1);
            payment -= VALUE_BILL_5;
        }

        change.setNumCoin2(payment / VALUE_COIN_2);

        return change;
    }
}
