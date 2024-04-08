import java.util.regex.Pattern;

public class Adress {
    private String ulica;
    private String numerDomu;
    private String kodPocztowy;
    private String miasto;

    public Adress(String kodPocztowy, String miasto, String numerDomu, String ulica) {
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setKodPocztowy(kodPocztowy);
        setMiasto(miasto);
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }
    public void setKodPocztowy(String kodPocztowy) {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{3}$");
        if(!pattern.matcher(kodPocztowy).matches()) {
            throw new IllegalArgumentException("nie poprawny kod pocztowy");
        }
        this.kodPocztowy = kodPocztowy;
    }
    public String getMiasto() {
        return miasto;
    }
    public void setMiasto(String miasto) {
        if(miasto == null){
            throw new IllegalArgumentException("Pole miasto nie może byc puste");
        }
        this.miasto = miasto;
    }
    public String getNumerDomu() {
        return numerDomu;
    }
    public void setNumerDomu(String numerDomu) {
        Pattern pattern = Pattern.compile("^[0-9]+[a-zA-Z]*$");
        if(!pattern.matcher(numerDomu).matches()) {
            throw new IllegalArgumentException("nie poprawny numer domu");
        }
        this.numerDomu = numerDomu;
    }
    public String getUlica() {
        return ulica;
    }
    public void setUlica(String ulica) {
        if(ulica == null){
            throw new IllegalArgumentException("Pole ulica nie może byc pusta");
        }
        this.ulica = ulica;
    }
}
