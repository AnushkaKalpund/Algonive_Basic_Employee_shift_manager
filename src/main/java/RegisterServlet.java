import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Redirect to POST if GET is used
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // Validate input
        if (username == null || username.trim().isEmpty()) {
            response.getWriter().write("Error: Username cannot be empty or null.");
            return;
        }
        if (password == null || password.trim().isEmpty()) {
            response.getWriter().write("Error: Password cannot be empty or null.");
            return;
        }
        if (email == null || email.trim().isEmpty()) {
            response.getWriter().write("Error: Email cannot be empty or null.");
            return;
        }

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user_registration", "root", "root");

            // Debugging: Print data to server logs
            System.out.println("Received data - Username: " + username + ", Password: " + password + ", Email: " + email);

            // Insert user data
            String sql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, email);

            // Execute query
            int rowsInserted = stmt.executeUpdate();

            // Close resources
            stmt.close();
            conn.close();

            // Response to the user
            if (rowsInserted > 0) {
                response.getWriter().write("User registered successfully for username: " + username);
            } else {
                response.getWriter().write("User registration failed.");
            }
        } catch (Exception e) {
            // Handle and log exceptions
            e.printStackTrace();
            response.getWriter().write("Error occurred: " + e.getMessage());
        }
    }
}
