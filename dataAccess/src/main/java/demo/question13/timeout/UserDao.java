package demo.question13.timeout;

import demo.question5to11.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("userdaotimeout")
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Transactional(timeout = 2)
    public void addUser(Users user1)
    {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        final  String query="insert into user(username,name,password,age,dob)values(?,?,?,?,?)";
        jdbcTemplate.update(query,new Object[]{user1.getUserName(), user1.getName(), user1.getPassword(), user1.getAge(), user1.getDob()});
    }

}
