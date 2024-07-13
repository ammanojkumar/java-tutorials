package service.process;

import repository.StudentRepo;
import service.util.ServiceUtil;

import java.util.List;

public class TimeService {

    StudentRepo studentRepo = new StudentRepo();
    public String getTime() {
        return studentRepo.getTime();
    }
}
