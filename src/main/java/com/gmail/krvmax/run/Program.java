package com.gmail.krvmax.run;

import com.gmail.krvmax.dao.UserDao;
import com.gmail.krvmax.entity.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Diland on 16.07.2014.
 */
public class Program {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/config.xml");
        DataSource dataSource = (DataSource) context.getBean("dataSource");
        Connection connection = dataSource.getConnection();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from test;");

        resultSet.next();
        System.out.println(resultSet.getString(2));

        resultSet.close();
        statement.close();
        connection.close();



    }
}

class SpringProgram {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/config.xml");
        EntityManagerFactory entityManagerFactory = (EntityManagerFactory) context.getBean("entityManagerFactory");

//        EntityManagerFactory entityManagerFactory = (EntityManagerFactory) entityManagerFactory.getObject();
        User user = new User();
        user.setDisplayNickName("MaximUm");
        user.setPassword("123456");
        user.setEmail("maxkr@i.ua");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        User gottenUser = entityManager.find(User.class, 1L);

        entityManager.close();
        System.out.println();
    }
}


class NotSimpleSpringProgram {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/config.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        System.out.println();
    }
}

class SimplePersistence {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyPersistenceUnit");
        User user = new User();
        user.setDisplayNickName("MaximUm");
        user.setPassword("123456");
        user.setEmail("maxkr@i.ua");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();

        User gottenUser = entityManager.find(User.class, 1L);

        entityManager.close();
        System.out.println();


    }
}
