package com.reubenhawley;

public class Auto {
    private String merk;
    private String type;
    private int pk;
    private boolean opgevoerd;


    public Auto() {
        merk = "merk onbekend";
        type = "";
        pk = 20;
        opgevoerd = false;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public boolean getOpgevoerd() {
        return opgevoerd;
    }

    public void setOpgevoerd(boolean opgevoerd) {
        this.opgevoerd = opgevoerd;
    }

    public String toString() {
        if (!this.opgevoerd) {
            int difference = berekenOpvoerMogelijkheid() - getPk();
            //Skoda Fabia (60 pk, maximaal op te voeren met 40)
            return merk + " " + type + " (" + pk + " pk, maximaal op te voeren met " + difference + ")";
        }
        else {
            return merk + " " + type + " (" + pk + " pk, maximaal op te voeren met " + 0 + ")";
        }
    }


    public void voerOp(int extraPk) {
        //Skoda opvoeren met 340 pk
        //340 is te veel, maximaal40
        //resultaat: Skoda Fabia (60 pk, maximaal op te voeren met 40)
        if (!this.opgevoerd) {
            int maximaal = berekenOpvoerMogelijkheid() - getPk();
            if (extraPk > maximaal) {
                System.out.println(extraPk + " is te veel, maximaal " + maximaal);
            } else {
                System.out.println(merk + " opvoeren met " + extraPk + " pk");
                setPk(getPk() + extraPk);
                System.out.println("resultaat: " + this.toString());
                setOpgevoerd(true);
            }
        } else {
            System.out.println("Dit auto is al opgevoerd en kan niet verder opgevoerd worden");
        }
    }

    public int berekenOpvoerMogelijkheid() {
        if (this.opgevoerd) {
            System.out.println("Dit auto is al opgevoerd, en kan niet verder opgevoerd worden");
            return 0;
        } else {
            return (getPk() * 2) - 20;
        }
    }
}

