package demo.question3nquestion4;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    static void printUserResultSet(ResultSet set) throws SQLException {
        while(set.next())
        {
            System.out.println("username: "+set.getString("username"));
            System.out.println("password: "+set.getString("password"));
            System.out.println("name: "+set.getString("name"));
            System.out.println("age: "+set.getInt("age"));
            System.out.println("dob: "+set.getDate("dob"));
        }
    }
    public static void main(String[] args) throws SQLException {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
        final String query="select * from user";

        //DriverManagerDataSource
        DataSource dataSource=context.getBean("dataSource",DataSource.class);
        Connection connection=dataSource.getConnection();

        PreparedStatement preparedStatement=connection.prepareStatement(query);
        ResultSet resultSet=preparedStatement.executeQuery();

        System.out.println("**********Using DriverManagerDataSource**********");
        printUserResultSet(resultSet);

        //dbcp2.BasicDataSource
        BasicDataSource basicDataSource=context.getBean(BasicDataSource.class);
        Connection basicDataSourceConnection=basicDataSource.getConnection();

        PreparedStatement preparedStatement1=basicDataSourceConnection.prepareStatement(query);
        resultSet=preparedStatement1.executeQuery();

        System.out.println("**********Using dpcp2.BasicDataSource**********");
        printUserResultSet(resultSet);

        //SingleDataSource
        SingleConnectionDataSource singleConnectionDataSource=context.getBean(SingleConnectionDataSource.class);
        Connection connection1=singleConnectionDataSource.getConnection();

        PreparedStatement preparedStatement2=connection1.prepareStatement(query);
        resultSet=preparedStatement2.executeQuery();

        System.out.println("**********Using SingleConnectionDataSource**********");
        printUserResultSet(resultSet);


        //




    }
}
