package model.dao;

import model.dao.impl.SellerDaoJDBC;
import src.db.DB;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
