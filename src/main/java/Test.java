import org.hibernate.SessionFactory;
import utils.HibernateUtil;

/**
 * Created by Dmitriy on 20.11.2015.
 * Project TestWebApp.
 */
public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
}
