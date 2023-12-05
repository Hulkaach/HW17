import TradeMark.TradeMark;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        Wine wine1 = new Wine("Шипр", TradeMark.LENTA, "Россия", "Игристое", 2008, LocalDate.of(2012, 02, 24));
        wine1.viderzka(LocalDate.now());
    }
}