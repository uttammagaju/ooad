
package Teacher;

import java.sql.*;
import java.util.*;

public class StoreAndRetriveData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/ooad";
        String uname = "root";
        String pwd = "";
        Scanner ob = new Scanner(System.in);
        int id = ob.nextInt();
        String name = ob.next();
        String address = ob.next();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pwd);
            String sql ="Insert into Student (id,name,address) values(?,?,?)";
            PreparedStatement st= con.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(2, name);
            st.setString(3, address);
            st.execute();
            System.out.println("Record Inserted");
            String sql1 = "select * from student";
            Statement st1= con.createStatement();
            ResultSet rs = st1.executeQuery(sql1);
            while(rs.next())
            {
                System.out.print(rs.getString("id"));
                System.out.print(" ");
                System.out.print(rs.getString("name" ));
                System.out.print(" ");
                System.out.println(rs.getString("address"));

            }
            con.close();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
