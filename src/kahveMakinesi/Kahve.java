package kahveMakinesi;

public class Kahve {

    private String kahveTuru="Atanmadı";
    private int sutMiktari;
    private int seker;
    private String bardakBoyu="Atanmadı";

    public Kahve(String kahveTuru) {
        this.kahveTuru = kahveTuru;
    }

    public Kahve() {
    }

    public String getKahveTuru() {
        return kahveTuru;
    }

    public void setKahveTuru(String kahveTuru) {
        this.kahveTuru = kahveTuru;
    }

    public int getSutMiktari() {
        return sutMiktari;
    }

    public void setSutMiktari(int sutMiktari) {
        this.sutMiktari = sutMiktari;
    }

    public int getSeker() {
        return seker;
    }

    public void setSeker(int seker) {
        this.seker = seker;
    }

    public String getBardakBoyu() {
        return bardakBoyu;
    }

    public void setBardakBoyu(String bardakBoyu) {
        this.bardakBoyu = bardakBoyu;
    }

    @Override
    public String toString() {
        return "Kahve{" +
                "kahveTuru='" + kahveTuru + '\'' +
                ", sutMiktari=" + sutMiktari +
                ", seker=" + seker +
                ", bardakBoyu='" + bardakBoyu + '\'' +
                "\n}";
    }
}
