package lesson_9;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Processor {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {
        try {
            connect();
            createTable(Cat.class);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            disconnect();
        }
    }

    public static void createTable(Class cl) throws SQLException {
        if(!cl.isAnnotationPresent(Table.class)){
            throw new RuntimeException("Class cannot support adding in to Table");
        }
        Map<Class, String> map = new HashMap<>();
        map.put(int.class, "INTEGER");
        map.put(String.class, "TEXT");
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        // 'CREATE TABLE '
        sb.append(((Table) cl.getAnnotation(Table.class)).title());
        // 'CREATE TABLE cats'
        sb.append(" (");
        // 'CREATE TABLE cats ('
        Field[] fields = cl.getDeclaredFields();
        for(Field f: fields){
            if(f.isAnnotationPresent(Column.class)){
                sb.append(f.getName());
                sb.append(" ");
                sb.append(map.get(f.getType()));
                sb.append(", ");
            }
        }
        // CREATE TABLE cats ('id INTEGER, name TEXT, age INTEGER, "
        sb.setLength(sb.length()-2);
        // CREATE TABLE cats ('id INTEGER, name TEXT, age INTEGER"
        sb.append(");");
        // CREATE TABLE cats ('id INTEGER, name TEXT, age INTEGER);"
        statement.executeUpdate(sb.toString());
    }

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Cannot connect to the DB ");
        }
    }
    public static void disconnect(){
        try{
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try{
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
