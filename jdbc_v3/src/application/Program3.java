package src.application;

import src.db.DB3;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program3 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("22/04/1985", dtf);
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB3.getConnection();
            /*
            st = conn.prepareStatement(
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, java.sql.Date.valueOf(date));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);
            */

            st = conn.prepareStatement(
                    "INSERT INTO department (Name) VALUES ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id: " + id);
                }
            } else {
                System.out.println("No rows affected");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB3.closeStatement(st);
            DB3.closeConnection();
        }
    }
}
