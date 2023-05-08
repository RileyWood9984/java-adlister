import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name="GuessMainServlet",urlPatterns = "/guess")
public class GuessMainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        req.getRequestDispatcher("./guessing-game.jsp").forward(req,res);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
        int numToGuess = (int) (Math.random()*3)+1;
        String toGuess = Integer.toString(numToGuess);
        String guess = req.getParameter("guess");
        String[] acceptable ={"1","2","3"};
        int i = Arrays.asList(acceptable).indexOf(guess);
        if(i!=-1){
         if(guess.equals(toGuess)){
             res.sendRedirect("/correct");
         }else{
             res.sendRedirect("/incorrect");
         }
        }else{
            res.sendRedirect("/guess");
        }
    }
}
