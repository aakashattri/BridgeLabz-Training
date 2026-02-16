


import java.sql.*;
import java.util.*;

public class DBStorage implements StorageService {
    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/addressbook",
                "root","root123");
    }

    public void save(List<Contact> contacts) throws Exception {
        Connection con=getConnection();
        PreparedStatement ps=con.prepareStatement(
        "insert into contacts values(?,?,?,?,?,?,?,?)");
        int count=0;
        for(Contact c:contacts){
            ps.setString(1,c.firstName);
            ps.setString(2,c.lastName);
            ps.setString(3,c.address);
            ps.setString(4,c.city);
            ps.setString(5,c.state);
            ps.setString(6,c.zip);
            ps.setString(7,c.phone);
            ps.setString(8,c.email);
             count=ps.executeUpdate();
        }
        System.out.println(count + " records inserted into DB");
        con.close();
    }

    public List<Contact> load() throws Exception {
        List<Contact> list=new ArrayList<>();
        Connection con=getConnection();
        ResultSet rs=con.createStatement().executeQuery("select * from contacts");

        while(rs.next())
            list.add(new Contact(rs.getString(1),rs.getString(2),rs.getString(3),
                    rs.getString(4),rs.getString(5),rs.getString(6),
                    rs.getString(7),rs.getString(8)));
        con.close();
        return list;
    }
}
