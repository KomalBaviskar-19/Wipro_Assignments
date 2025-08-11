import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class WelcomeServlet1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);

        if (session != null) {
            String name = (String) session.getAttribute("name");
            String age = (String) session.getAttribute("age");
            String password = (String) session.getAttribute("password");
            String gender = (String) session.getAttribute("gender");
            String address = (String) session.getAttribute("address");

            out.println("<html><body style='background:#f5f7fa;font-family:sans-serif;padding:20px;'>");
            out.println("<h2>Welcome, " + name + "!</h2>");
            out.println("<p><strong>Age:</strong> " + age + "</p>");
            out.println("<p><strong>Gender:</strong> " + gender + "</p>");
            out.println("<p><strong>Address:</strong> " + address + "</p>");
            out.println("</body></html>");
        } else {
            out.println("No session found. Please submit the form first.");
        }
    }
}
