package demo.question13.readonly;

import demo.question12.mandatory.UserDao2;
import demo.question5to11.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("userdaoreadonly")
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Transactional(readOnly = true)
    public void addUser(Users user1)
    {
        final  String query="insert into user(username,name,password,age,dob)values(?,?,?,?,?)";
        jdbcTemplate.update(query,new Object[]{user1.getUserName(), user1.getName(), user1.getPassword(), user1.getAge(), user1.getDob()});
    }

}
