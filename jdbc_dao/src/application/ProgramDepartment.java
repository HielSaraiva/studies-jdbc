package src.application;

import src.db.DB;
import src.model.dao.DaoFactory;
import src.model.dao.DepartmentDao;
import src.model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class ProgramDepartment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: findById =====");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n\n===== TEST 2: findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n\n===== TEST 3: insert =====");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n\n===== TEST 4: update =====");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n\n===== TEST 5: deleteById =====");
        System.out.print("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        sc.close();
        DB.closeConnection();
    }
}
