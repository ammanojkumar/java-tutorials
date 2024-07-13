package repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentRepo {

    public String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
    }
}
