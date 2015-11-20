package utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by Dmitriy on 20.11.2015.
 * Project TestWebApp.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        Configuration configuration = new Configuration().configure();

        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

        sessionFactory = configuration.buildSessionFactory(builder.build());
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
