package rw.ac.auca.service;

import rw.ac.auca.dao.AccademicUnitDao;
import rw.ac.auca.model.AccademicUnit;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class AccademicUnitService extends UnicastRemoteObject implements AccademicUnitInterface {
    public AccademicUnitService() throws RemoteException {
        super();
    }
AccademicUnitDao dao = new AccademicUnitDao();
    @Override
    public boolean createAcademicUnit(AccademicUnit accademicUnit) throws RemoteException {
        return dao.createAcademicUnit(accademicUnit);
    }

    @Override
    public boolean updateAcademicUnit(AccademicUnit accademicUnit) throws RemoteException {
        return dao.updateAcademicUnit(accademicUnit);
    }

    @Override
    public boolean deleteAcademicUnit(AccademicUnit accademicUnit) throws RemoteException {
        return dao.deleteAcademicUnit(accademicUnit);
    }

    @Override
    public List<AccademicUnit> accademicUnitList() throws RemoteException {
        return dao.accademicUnitList();
    }
}
