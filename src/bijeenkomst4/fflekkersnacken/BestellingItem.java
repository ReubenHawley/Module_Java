/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bijeenkomst4.fflekkersnacken;

import java.util.Objects;

/**
 *
 * @author eb0095856
 */
public class BestellingItem {
    public String product;
    public int aantal;

    BestellingItem(String product, int aantalProducten) {
        this.product = product;
        this.aantal = aantalProducten;
    }

    @Override
    public String toString() {
        return "product:" + product + ", aantal:" + aantal;
    }   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BestellingItem other = (BestellingItem) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
    
}
