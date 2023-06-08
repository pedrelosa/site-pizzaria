package br.com.fabricadapizzace.app;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import br.com.fabricadapizzace.connection.ConnectionDAO;
import br.com.fabricadapizzace.model.Cliente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        ConnectionDAO<Cliente> clienteConnectionDAO = new  ConnectionDAO<>();

        Cliente cliente1 = clienteConnectionDAO.encontrar(new Cliente(), 1L);
        Cliente cliente2 = clienteConnectionDAO.encontrar(new Cliente(), 2L);

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(cliente1);
        clientes.add(cliente2);

        request.setAttribute("listadeclientes", clientes);

        RequestDispatcher rd = request.getRequestDispatcher("teste.jsp");

        rd.forward(request, response);
    }

    public void destroy() {
    }
}