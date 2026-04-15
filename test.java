

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String USERNAME = "testuser";
    private static final String PASSWORD = "testpass";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            response.getWriter().println("<h2>Login successful!</h2>");
        } else {
            response.getWriter().println("<h2>Invalid credentials</h2>");
        }
    }
}
