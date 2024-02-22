package rw.ac.auca.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import rw.ac.auca.model.AccademicUnit;

import java.util.List;

public class AccademicUnitDao {
    public boolean createAcademicUnit(AccademicUnit accademicUnit){
        try {
            boolean result= true;
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(accademicUnit);
            tr.commit();
            ss.close();
            return result;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean updateAcademicUnit(AccademicUnit accademicUnit){
        try {
            boolean result= true;
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(accademicUnit);
            tr.commit();
            ss.close();

            return result;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteAcademicUnit(AccademicUnit accademicUnit){
        try {
            boolean result= true;
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(accademicUnit);
            tr.commit();
            ss.close();

            return result;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    public List<AccademicUnit> accademicUnitList(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<AccademicUnit> accademicUnits = ss.createQuery("select academic from AccademicUnit academic").list();

            ss.close();
            return accademicUnits;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
