package ss20.local_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Demo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("ngày hiện tại: "+date);
        LocalDate bod = LocalDate.of(2005, 07, 02);
        System.out.println("Ngày sinh nhật: "+bod);

        // giờ phút giây
        LocalTime time = LocalTime.now();
        System.out.println("thời gian hiện tại: "+time);
        LocalTime bodTime = LocalTime.of(23, 39, 29);
        System.out.println("Giờ sinh của bố Quang: "+bodTime);

        // all
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("ngày giờ hiện tại: "+nowDateTime);

        // tính khoảng cách time
        Period period = Period.between(bod, date);
        System.out.println("Tuổi của tôi hiện tại: "+period.getYears());
        // công thêm tuổi
        System.out.println("Tuổi của tôi sau thêm: "+period.plus(Period.ofYears(2)));

    }
}