package demo.question12.supports;

import demo.question5to11.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository("userdao2supports")
public class UserDao2 {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Transactional(propagation=Propagation.SUPPORTS)
    public void addUser(Users user) {
        final  String query="insert into user(username,name,password,age,dob)values(?,?,?,?,?)";
        jdbcTemplate.update(query,new Object[]{user.getUserName(), user.getName(), user.getPassword(), user.getAge(), user.getDob()});
        throw new RuntimeException();
    }
}
