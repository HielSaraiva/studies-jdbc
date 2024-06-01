package src.model.dao;

import src.model.dao.impl.SellerDaoJDBC;
import src.db.DB;

public class DaoFactory {

    public static src.model.dao.SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
