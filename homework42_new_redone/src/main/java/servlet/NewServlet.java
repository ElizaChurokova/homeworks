package servlet;

import servlet.db.DataBase;
import servlet.model.Submissions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/submissions")
public class NewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         req.getRequestDispatcher("submissions.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Submissions subm = new Submissions();
        subm.setSubmissionLogin(req.getParameter("submission_login"));
        subm.setSubmissionPassword(req.getParameter("submission_password"));
        subm.setGender(req.getParameter("gender"));

      //  boolean res = DataBase.submit(subm);


    }
}
