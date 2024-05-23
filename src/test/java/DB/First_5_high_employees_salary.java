package DB;

import org.apache.poi.ss.usermodel.ConditionType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;

public class First_5_high_employees_salary {
    @Test
    public void highSalary() throws SQLException {

        /** Get first name and salary of second highest salary **/
        String UserName = "hr";
        String PassWord = "hr";
        String URL = "jdbc:oracle:thin:@107.22.159.48:1521:XE";

        Connection con = DriverManager.getConnection(URL, UserName, PassWord);
        Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//        ResultSet rs = st.executeQuery("select first_name, salary from employees where salary > 13000 order by salary asc");
//        rs.next();
//        String first = rs.getString(1);
//        System.out.println("Karen = "+first);
//
//        rs.absolute(3);
//        String third = rs.getString(1);
//        System.out.println("Neena = "+third);
//
//        rs.last();
//        String last = rs.getString(1);
//        System.out.println("Steven = "+last);
//
//
//
//        rs.close();
//        st.close();
//        con.close();

        /**  **/

        ResultSet rs = st.executeQuery("select last_name from (select * from EMPLOYEES e inner join DEPARTMENTS d\n" +
                "                                                            on e.DEPARTMENT_ID = d.DEPARTMENT_ID)\n" +
                "where EMPLOYEE_ID = 115");

        rs.next();
        String actualName = rs.getString(1);
        String expectedName = "Khoo";
        System.out.println("Khoo = " +actualName);
        Assert.assertEquals(expectedName,actualName);




    }

}
