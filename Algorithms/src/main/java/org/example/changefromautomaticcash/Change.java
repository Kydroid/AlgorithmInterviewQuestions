package org.example.changefromautomaticcash;

import java.util.Objects;

public class Change {
    public static final int VALUE_BILL_10 = 10;
    public static final int VALUE_BILL_5 = 5;
    public static final int VALUE_COIN_2 = 2;

    private int numBill10;
    private int numBill5;
    private int numCoin2;

    public Change() {
    }

    public Change(int numBill10, int numBill5, int numCoin2) {
        this.numBill10 = numBill10;
        this.numBill5 = numBill5;
        this.numCoin2 = numCoin2;
    }

    public int getNumBill10() {
        return numBill10;
    }

    public void setNumBill10(int numBill10) {
        this.numBill10 = numBill10;
    }

    public int getNumBill5() {
        return numBill5;
    }

    public void setNumBill5(int numBill5) {
        this.numBill5 = numBill5;
    }

    public int getNumCoin2() {
        return numCoin2;
    }

    public void setNumCoin2(int numCoin2) {
        this.numCoin2 = numCoin2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Change change = (Change) o;
        return numBill10 == change.numBill10 &&
                numBill5 == change.numBill5 &&
                numCoin2 == change.numCoin2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numBill10, numBill5, numCoin2);
    }

    @Override
    public String toString() {
        return "Change{" +
                "numBill10=" + numBill10 +
                ", numBill5=" + numBill5 +
                ", numCoin2=" + numCoin2 +
                '}';
    }
}
