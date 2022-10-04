package pac;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Iniciando...");

        // Abrimos conexion a la base de datos
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
        Session session = sessionFactory.openSession();
        System.out.println("Configuracion realizada");

        // Añadimos primer modulo
        Transaction tx = session.beginTransaction();
        Modulo mod1 = new Modulo();
        mod1.setNombre("Programacion B");
        mod1.setCodigo("M03B");
        session.save(mod1);
        tx.commit();

        // Imprimimos en pantalla el primer modulo
        tx = session.beginTransaction();
        Query query = session.createQuery("FROM Modulo");
        List list = query.list();
        System.out.println(list.get(0).toString());
        tx.commit();

        // Añadimos el segundo modulo
        tx = session.beginTransaction();
        Modulo mod2 = new Modulo();
        mod2.setNombre("Acceso a Datos");
        mod2.setCodigo("M06");
        session.save(mod2);
        tx.commit();

        // Imprimimos el segundo modulo
        tx = session.beginTransaction();
        query = session.createQuery("FROM Modulo");
        list = query.list();
        System.out.println(list.get(1).toString());
        tx.commit();

        // Añadimos el tercer modulo
        tx = session.beginTransaction();
        Modulo mod3 = new Modulo();
        mod3.setNombre("Desarrollo de aplicaciones moviles");
        mod3.setCodigo("M08");
        session.save(mod3);
        tx.commit();

        // Imprimimos el tercer modulo
        tx = session.beginTransaction();
        query = session.createQuery("FROM Modulo");
        list = query.list();
        System.out.println(list.get(2).toString());
        tx.commit();

        // Añadimos el cuarto modulo
        tx = session.beginTransaction();
        Modulo mod4 = new Modulo();
        mod4.setNombre("Servicios y procesos");
        mod4.setCodigo("M09");
        session.save(mod4);
        tx.commit();

        // Imprimimos el cuarto modulo
        tx = session.beginTransaction();
        query = session.createQuery("FROM Modulo");
        list = query.list();
        System.out.println(list.get(3).toString());
        tx.commit();

        // Añadimos el primer profesor
        tx = session.beginTransaction();
        Profesor pro1 = new Profesor();
        pro1.setNombre("Alvaro");
        pro1.setSexo("Hombre");
        session.save(pro1);
        tx.commit();

        // Imprimimos el primer profesor
        tx = session.beginTransaction();
        query = session.createQuery("FROM Profesor");
        list = query.list();
        System.out.println(list.get(0).toString());
        tx.commit();

        // Añadimos el primer alumno
        tx = session.beginTransaction();
        Alumno alu1 = new Alumno();
        alu1.setNombre("Juan");
        alu1.setNacionalidad("Espaniola");
        alu1.setEdad(26);
        alu1.setSexo("Hombre");
        alu1.addModulo(mod1);
        alu1.addModulo(mod2);
        alu1.addModulo(mod3);
        alu1.addModulo(mod4);
        session.save(alu1);
        tx.commit();

        // Imprimimos el primer alumno
        tx = session.beginTransaction();
        query = session.createQuery("FROM Alumno");
        list = query.list();
        System.out.println(list.get(0).toString());
        tx.commit();

        // Añadimos el segundo alumno
        tx = session.beginTransaction();
        Alumno alu2 = new Alumno();
        alu2.setNombre("Pedro");
        alu2.setNacionalidad("Andorrana");
        alu2.setEdad(21);
        alu2.setSexo("Hombre");
        alu2.addModulo(mod1);
        alu2.addModulo(mod2);
        alu2.addModulo(mod4);
        session.save(alu2);
        tx.commit();

        // Imprimimos el segundo alumno
        tx = session.beginTransaction();
        query = session.createQuery("FROM Alumno");
        list = query.list();
        System.out.println(list.get(1).toString());
        tx.commit();

        // Añadimos el tercer alumno
        tx = session.beginTransaction();
        Alumno alu3 = new Alumno();
        alu3.setNombre("Marta");
        alu3.setNacionalidad("Espaniola");
        alu3.setEdad(19);
        alu3.setSexo("Mujer");
        alu3.addModulo(mod3);
        alu3.addModulo(mod4);
        session.save(alu3);
        tx.commit();

        // Imprimimos el tercer alumno
        tx = session.beginTransaction();
        query = session.createQuery("FROM Alumno");
        list = query.list();
        System.out.println(list.get(2).toString());
        tx.commit();

        // Añadimos el cuarto alumno
        tx = session.beginTransaction();
        Alumno alu4 = new Alumno();
        alu4.setNombre("Carla");
        alu4.setNacionalidad("Francesa");
        alu4.setEdad(35);
        alu4.setSexo("Mujer");
        alu4.addModulo(mod2);
        alu4.addModulo(mod3);
        alu4.addModulo(mod4);
        session.save(alu4);
        tx.commit();

        // Imprimimos el cuerto alumno
        tx = session.beginTransaction();
        query = session.createQuery("FROM Alumno");
        list = query.list();
        System.out.println(list.get(3).toString());
        tx.commit();

        // Cerramos conexion a la base de datos
        session.close();
        sessionFactory.close();
    }
}