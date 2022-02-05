/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bijeenkomst4.fflekkersnacken;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author eb0095856
 */
public class Bestelling {

    public static int bestellingTeller = 0;

    public String locatie;
    public String tijd;
    public String klas;
    public ArrayList<BestellingItem> bestellingRecords = new ArrayList();
    public int bestellingNummer;

    public Bestelling(String locatie, String tijd, String klas) {
        this.locatie = locatie;
        this.tijd = tijd;
        this.klas = klas;

        this.bestellingNummer = ++bestellingTeller;
    }

    void addBestellingItem(BestellingItem bestellingItem) {
        for (BestellingItem bestelling : bestellingRecords)
            if (bestelling.equals(bestellingItem)) {

                bestelling.aantal+=bestellingItem.aantal;
            } else {
                bestellingRecords.add(bestellingItem);
            }

    }

    @Override
    public String toString() {
        String result = "Bestelling locatie: " + locatie + ", tijd: " + tijd + ", klas: " + klas + ", bestellingNummer: " + bestellingNummer;
        for (BestellingItem item : bestellingRecords) {
            result = result + "\n" + item.toString();
        }
        return result;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.locatie);
        hash = 83 * hash + Objects.hashCode(this.tijd);
        hash = 83 * hash + Objects.hashCode(this.klas);
        hash = 83 * hash + this.bestellingNummer;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.klas == ((Bestelling) obj).klas &&
                this.locatie == ((Bestelling) obj).locatie &&
                this.tijd == ((Bestelling) obj).tijd) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bestelling other = (Bestelling) obj;
        if (!Objects.equals(this.locatie, other.locatie)) {
            return false;
        }
        if (!Objects.equals(this.tijd, other.tijd)) {
            return false;
        }
        if (!Objects.equals(this.klas, other.klas)) {
            return false;
        }
        return true;
    }

    public boolean samenvoegen(Bestelling bestelling) {
        if (this.equals(bestelling)) {
            for (BestellingItem item : this.bestellingRecords) {
                for (BestellingItem nieuweBestellingItem : bestelling.bestellingRecords) {
                    if (item.equals(nieuweBestellingItem)) {
                        //samenvoegen
                        item.aantal = nieuweBestellingItem.aantal;
                    } else {
                        //toevoegen
                        this.bestellingRecords.add(nieuweBestellingItem);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static Bestelling bestellingenSamenvoegen(Bestelling lhsBestelling, Bestelling rhsBestelling) {
        if (lhsBestelling.equals(rhsBestelling)) {
            lhsBestelling.samenvoegen(rhsBestelling);
            return lhsBestelling;
        }
        return null;
    }

    public static ArrayList<Bestelling> bestellingenControleren(ArrayList<Bestelling> bestellingenLijst) {

        if (bestellingenLijst.size() < 2) {
            return bestellingenLijst;
        }

        for (int i = 0; i < bestellingenLijst.size(); i++) {
            Bestelling lhs = bestellingenLijst.get(i);

            for (int j = 0; j < bestellingenLijst.size(); j++) {
                if (i == j) {
                    continue;
                }
                Bestelling rhs = bestellingenLijst.get(j);
                if (lhs.equals(rhs)) {
                    lhs.samenvoegen(rhs);
                    bestellingenLijst.remove(rhs);
                }
            }
        }
        return bestellingenLijst;
    }


}

