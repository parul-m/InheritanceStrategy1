
import dto.Clerk;
import dto.Manager;
import myconfig.connection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class test {
    public static void main(String[] args) {
        SessionFactory sf = connection.getSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        Manager m = new Manager(20000, 30000, 101, "Vdhi", 284343);
        s.save(m);
        
        Clerk c = new Clerk(30000, 102, "Pooja", 3435314);
        s.save(c);
        
        t.commit();
        s.close();
        sf.close();
}
}
