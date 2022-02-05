package bijeenkomst4.Postcode;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Postcode implements Comparable {
    private static ArrayList<Postcode> lijst = new ArrayList<>();
    private String code;
    private String woonplaats;
    private String straatnaam;

    public static void createPostcode(String pc, String wp, String sn) {
        Postcode lpc = findPostcode(pc);
        if (lpc ==null){
            lijst.add(new Postcode(pc, wp, sn));
        }else{
            lpc.setWoonplaats(wp);
            lpc.setStraatnaam(sn);
        }
    }

    private Postcode(String pc, String wp, String sn) {
        this.code = pc;
        this.woonplaats = wp;
        this.straatnaam = sn;
    }

    public String getStraatnaam() {
        return this.straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        this.straatnaam = straatnaam;
    }

    public String getWoonplaats() {
        return this.woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Postcode findPostcode(String pc) {
        Collections.sort(lijst);
        for (Postcode code:lijst) {
            if (code.getCode()==pc)
                return code;
        }
        return null;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (o instanceof Postcode) {
            if (((Postcode) o).getCode().equals(this.code)) {
                return 0;
            } else {
                return -1;
            }
        }else{
            return -1;
        }
    }
}
