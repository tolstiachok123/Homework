package by.andruhovich.controller;

import by.andruhovich.entity.User;
import by.andruhovich.repository.UserRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        service(request, response);
    }

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        UserRepository repository = new UserRepository();
        User user = userCreation(request);
        if ("login".equals(action)) {
            if (repository.getUsersListFromDB().contains(user)) {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/greeting.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/registration.jsp");
                dispatcher.forward(request, response);
            }
        } else if ("registration".equals(action)) {
            repository.addUserToDB(user.getLogin(), user.getPassword());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/greeting.jsp");
            dispatcher.forward(request, response);
        } else if ("join us".equals(action)) {
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/registration.jsp");
            dispatcher.forward(request, response);
        }
    }

    public User userCreation(ServletRequest request) throws ServletException, IOException {
        User user = new User();
        user.setLogin(request.getParameter("username"));
        user.setPassword(request.getParameter("pass"));
        return user;
    }
}
