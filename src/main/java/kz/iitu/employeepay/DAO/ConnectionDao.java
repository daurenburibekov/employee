//package kz.iitu.employeepay.DAO;
//
//import kz.iitu.employeepay.models.Employee;
//import kz.iitu.employeepay.Employees.SalariedEmployee;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import java.sql.*;
//@Component
//@Getter
//@Setter
//public class ConnectionDao {
//    @Value("${connectionDao.dbUrl}")
//    private String dbUrl;
//    @Value("${connectionDao.dbUsername}")
//    private String dbUsername;
//    @Value("${connectionDao.dbPassword}")
//    private String dbPassword;
//    private Connection connection;
//    private Statement statement;
//    private PreparedStatement pstmt;
//    private ResultSet rs;
//
//    @PostConstruct
//    public void init() throws SQLException {
//        this.setConnection();
//    }
//    public void setConnection() throws SQLException {
//        connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//        statement = connection.createStatement();
//    }
//    @PreDestroy
//    public void destroy() throws SQLException {
//        this.closeConnections();
//    }
//    public void closeConnections() throws SQLException {
//        rs.close();
//        connection.close();
//    }
//
//    public void addEmployee(Employee employee) throws SQLException {
//        String SQL = "INSERT INTO employee(name,salary) VALUES(?,?)";
//        pstmt = connection.prepareStatement(SQL);
//        pstmt.setString(1, employee.getName());
//        pstmt.setDouble(2, employee.getSalary());
//        pstmt.executeUpdate();
//    }
//
//    public void updateSalary(String name, double salary) throws SQLException {
//        String SQL = "UPDATE employee SET salary = ? WHERE name = ?";
//        pstmt = connection.prepareStatement(SQL);
//        pstmt.setDouble(1, salary);
//        pstmt.setString(2, name);
//        pstmt.executeUpdate();
//    }
//
//    public Employee getEmployeeByName(String name) throws SQLException {
//        Employee emp = null;
//        rs = statement.executeQuery("SELECT name, salary FROM employee WHERE name = '" + name + "'");
//        while (rs.next()) {
//            emp =  new SalariedEmployee(rs.getString(1), rs.getDouble(2));
//        }
//        return emp;
//    }
//
//    public void deleteEmployeeByName(String name) throws SQLException {
//        statement.executeUpdate("DELETE FROM employee WHERE name = '" + name + "'");
//    }
//    public void getUsers() throws SQLException {
//        rs = statement.executeQuery("SELECT * FROM employee");
//        while (rs.next()) {
//            System.out.printf("%-30.30s %-30.30s %-30.30s%n", rs.getInt("id"), rs.getString("name"), rs.getString("salary"));
//        }
//    }
//
//
//}
