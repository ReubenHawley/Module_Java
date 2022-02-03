package bijeenkomst4.LegitimatieBewijs;

import java.util.Objects;

public class Persoon {
    private String naam;
    private Rijbewijs rijbewijs;
    private Reisdocument reisdocument;

    public Persoon(Reisdocument reisdocument) {
        this.reisdocument = reisdocument;
        this.naam = reisdocument.getNaam();
    }

    public Persoon(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
        this.naam = rijbewijs.getNaam();
    }

    public void setRijbewijs(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
    }

    public void setReisdocument(Reisdocument reisdocument) {
        this.reisdocument = reisdocument;
    }

    public Legitimatiebewijs getLegitimatie() {
        if (rijbewijs != null) {
            return rijbewijs;
        } else if (reisdocument != null) {
            return reisdocument;
        } else {
            return null;
        }
    }

    public void toonOverzicht() {
        if (getLegitimatie() == null) {
            System.out.println(naam + ", kan zich niet legitimeren");
        } else {
            System.out.println(naam + ", BSN: " + getLegitimatie().getBSN());
            if (rijbewijs != null) {
                System.out.println("  Rijbewijs, categorie " + rijbewijs.getCategorie());
            }
            if (reisdocument != null) {
                System.out.println("  Reisdocument: " + reisdocument.getDocumenttype() + ", reizen in " + reisdocument.getGeldigeLanden());
            }
        }
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "naam='" + naam + '\'' +
                ", rijbewijs=" + rijbewijs +
                ", reisdocument=" + reisdocument +
                '}';
    }
}
