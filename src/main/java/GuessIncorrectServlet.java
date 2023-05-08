import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GuessIncorrectServlet", urlPatterns = "/incorrect")
public class GuessIncorrectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws SecurityException, IOException, ServletException {
        req.setAttribute("result","You Guessed Incorrectly!");
        req.getRequestDispatcher("./guessing-game-results.jsp").forward(req,res);
    }
}
