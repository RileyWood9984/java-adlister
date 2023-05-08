import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if(session.getAttribute("user")==null){
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req,res);
        }else{
            res.sendRedirect("/profile");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        HttpSession session = req.getSession();

        if (validAttempt) {
            session.setAttribute("user",username);
            res.sendRedirect("/profile");
        } else {
            res.sendRedirect("/login");
        }
    }
}
