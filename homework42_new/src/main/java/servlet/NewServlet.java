package servlet;

import servlet.db.DataBase;
import servlet.model.Submissions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DatabaseMetaData;
@WebServlet("/homework42_new")
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter printWriter = resp.getWriter();
    printWriter.println("Hi!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Submissions subm = new Submissions();
        subm.setSubmissionLogin(req.getParameter("submissionLogin"));
        subm.setSubmissionPassword(req.getParameter("submissionPassword"));
        subm.setGender(req.getParameter("gender"));

        boolean res = DataBase.submit(subm);


    }
}
