package br.com.carstore.serviet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")

public class CreateCarServiet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String carname = request.getParameter("carName");

        System.out.println("O nome do meu carro é: " + carname);

        request.getRequestDispatcher("index.html").forward(request, resp);
    }
}



