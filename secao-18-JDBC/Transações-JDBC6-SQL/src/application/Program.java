package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class  Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                "DELETE FROM department "
                    + "WHERE "
                    + "Id = ?");

            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
        }
        catch (SQLException e){
            if (e instanceof java.sql.SQLIntegrityConstraintViolationException ){
                System.out.println("Integrity error: You cannot delete this department because there are salespeople linked to it!");
            }else{
                throw new DbIntegrityException(e.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}