package Pojo;
// Generated 09.May.2019 23:00:31 by Hibernate Tools 4.3.1



/**
 * Turlar generated by hbm2java
 */
public class Turlar  implements java.io.Serializable {


     private Integer turId;
     private String tadi;
     private int fiyat;
     private String kacgun;
     private String kacgece;
     private String nereden;
     private String nereye;

    public Turlar() {
    }

    public Turlar(String tadi, int fiyat, String kacgun, String kacgece, String nereden, String nereye) {
       this.tadi = tadi;
       this.fiyat = fiyat;
       this.kacgun = kacgun;
       this.kacgece = kacgece;
       this.nereden = nereden;
       this.nereye = nereye;
    }
   
    public Integer getTurId() {
        return this.turId;
    }
    
    public void setTurId(Integer turId) {
        this.turId = turId;
    }
    public String getTadi() {
        return this.tadi;
    }
    
    public void setTadi(String tadi) {
        this.tadi = tadi;
    }
    public int getFiyat() {
        return this.fiyat;
    }
    
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    public String getKacgun() {
        return this.kacgun;
    }
    
    public void setKacgun(String kacgun) {
        this.kacgun = kacgun;
    }
    public String getKacgece() {
        return this.kacgece;
    }
    
    public void setKacgece(String kacgece) {
        this.kacgece = kacgece;
    }
    public String getNereden() {
        return this.nereden;
    }
    
    public void setNereden(String nereden) {
        this.nereden = nereden;
    }
    public String getNereye() {
        return this.nereye;
    }
    
    public void setNereye(String nereye) {
        this.nereye = nereye;
    }




}


