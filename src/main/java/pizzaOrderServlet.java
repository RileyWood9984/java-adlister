import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name="PizzaOrderServlet",urlPatterns = "/pizza-order")
public class pizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        req.getRequestDispatcher("./pizza-order.jsp").forward(req,res);
    }
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] top = req.getParameterValues("top");
        String address = req.getParameter("address");
        System.out.println("Size "+size);
        System.out.println("Crust type "+crust);
        System.out.println("Sauce type "+sauce);
        System.out.println("Toppings "+ Arrays.toString(top));
        System.out.println("Deliver to "+address);

        req.getRequestDispatcher("./pizza_order.jsp").forward(req,res);
    }
}
