package by.andruhovich.repository;

import by.andruhovich.entity.User;
import by.andruhovich.util.db.DBUtil;

import java.sql.*;
import java.util.ArrayList;

public class UserRepository {

    private final String getUserQuery = "Select * from Users";

    private final String addUserQuery = "INSERT INTO Users (login, password) VALUES (?, ?)";

    public void addUserToDB(String login, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(addUserQuery);
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
            DBUtil.addConnection(connection);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

    public ArrayList<User> getUsersListFromDB() {
        ArrayList<User> users = new ArrayList<User>();
        try {
            Connection connection = DBUtil.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getUserQuery);
            users.addAll(createUsersList(resultSet));
            DBUtil.addConnection(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    private static ArrayList<User> createUsersList(ResultSet resultSet) throws SQLException {
        ArrayList<User> users = new ArrayList<User>();
        while (resultSet.next()) {
            User user = new User();
            user.setLogin(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            users.add(user);
        }
        return users;
    }
}
