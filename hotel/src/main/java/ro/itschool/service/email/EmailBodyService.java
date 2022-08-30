package ro.itschool.service.email;


import org.springframework.stereotype.Service;
import ro.itschool.entity.MyUser;

@Service
public interface EmailBodyService {

    String emailBody (MyUser myUser);

}
