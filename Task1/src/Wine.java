import TradeMark.TradeMark;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String name;
    private TradeMark tradeMark;
    private String country;
    private String text;
    private int yearSbora;
    private LocalDate dateRozliv;

    public void viderzka(LocalDate localDate) {
        System.out.println("Выдержка вина " + Period.between(dateRozliv, localDate).getYears() + " лет(года)");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public TradeMark getTradeMark() {
        return tradeMark;
    }
    public void setTradeMark(TradeMark tradeMark) {
        this.tradeMark = tradeMark;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getYearSbora() {
        return yearSbora;
    }
    public void setYearSbora(int yearSbora) {
        this.yearSbora = yearSbora;
    }
    public LocalDate getDateRozliv() {
        return dateRozliv;
    }
    public void setDateRozliv(LocalDate dateRozliv) {
        this.dateRozliv = dateRozliv;
    }
    @Override
    public String toString() {
        return "Wine{" +
                "name='" + name + '\'' +
                ", tradeMark=" + tradeMark +
                ", country='" + country + '\'' +
                ", text='" + text + '\'' +
                ", yearSbora=" + yearSbora +
                ", dateRozliv=" + dateRozliv +
                '}';
    }

    public Wine(String name, TradeMark tradeMark, String country, String text, int yearSbora, LocalDate dateRozliv) {
        this.name = name;
        this.tradeMark = tradeMark;
        this.country = country;
        this.text = text;
        this.yearSbora = yearSbora;
        this.dateRozliv = dateRozliv;
    }
}
