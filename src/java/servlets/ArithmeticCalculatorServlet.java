/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author wenchi
 */
public class ArithmeticCalculatorServlet extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstNumberS = request.getParameter("first_number");
        String secondNumberS = request.getParameter("second_number");
        String actionMethod = request.getParameter("cal_method");
        String resultMessage = "";
        request.setAttribute("firstnumber", firstNumberS);
        request.setAttribute("secondnumber", secondNumberS);
        if( firstNumberS == null || firstNumberS == "" || !firstNumberS.matches("\\d+")
            || secondNumberS == null || secondNumberS == "" || !secondNumberS.matches("\\d+")    )
        {
            resultMessage = "invalid";
            request.setAttribute("message", resultMessage);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        int firstNumber = Integer.parseInt(firstNumberS);
        int secondNumber = Integer.parseInt(secondNumberS);
        int resultNumber;
        if (actionMethod.equals("+"))
            resultMessage = Integer.toString(firstNumber + secondNumber);
        else if(actionMethod.equals("-"))
            resultMessage = Integer.toString(firstNumber - secondNumber);
        else if(actionMethod.equals("*"))
            resultMessage = Integer.toString(firstNumber * secondNumber);
        else
            resultMessage = Integer.toString(firstNumber / secondNumber);
        request.setAttribute("message", resultMessage);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        
        
    }

}
