package demo.question12.mandatory;

import demo.question5to11.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("userdaomandatory")
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserDao2 userDao2;
    @Transactional
    public void addTwoUsers(Users user1,Users user2)
    {
        final  String query="insert into user(username,name,password,age,dob)values(?,?,?,?,?)";
        jdbcTemplate.update(query,new Object[]{user1.getUserName(), user1.getName(), user1.getPassword(), user1.getAge(), user1.getDob()});
        try {
            userDao2.addUser(user2);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }


    }

}
