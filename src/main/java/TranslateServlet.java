import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslateServlet", urlPatterns = "/translate")
public class TranslateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "Xin chào");
        map.put("Time", "Thời gian");
        map.put("Year", "Năm");
        map.put("Way", "Con đường");
        map.put("Good bye", "Tạm biệt");
        map.put("Day", "Ngày");
        map.put("Life", "Cuộc sống");
        map.put("Thank you", "Cảm ơn");
        map.put("Family", "Gia đình");
        map.put("Place", "Vị trí");

        String inputWord = request.getParameter("inputWord");
        String result = map.get(inputWord);
        PrintWriter printWriter = response.getWriter();
        if (result == null) {
            printWriter.println("<html>\n" +
                    "  <head>\n" +
                    "<meta charset=\"UTF-8\">" +
                    "    <title>Simple Dictionary</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n" +
                    "          integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "  <div class=\"container\">\n" +
                    "    <h1>Vietnamese Dictionary</h1>\n" +
                    "    <form method=\"get\" action=\"/translate\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col\">\n" +
                    "          <input type=\"text\" class=\"form-control\" name=\"inputWord\" placeholder=\"Input here...\">\n" +
                    "        </div>\n" +
                    "        <div class=\"col\">\n" +
                    "          <input class=\"form-control\" type=\"text\" name=\"resultWord\" placeholder=\"Result\" value=\"Not found!\" readonly>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "      <input class=\"btn btn-primary\" style=\"margin-top: 10px\" type=\"submit\" value=\"Search\">\n" +
                    "    </form>\n" +
                    "  </div>\n" +
                    "  </body>\n" +
                    "</html>");
        } else {
            printWriter.println("<html>\n" +
                    "  <head>\n" +
                    "<meta charset=\"UTF-8\">" +
                    "    <title>Simple Dictionary</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n" +
                    "          integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n" +
                    "  </head>\n" +
                    "  <body>\n" +
                    "  <div class=\"container\">\n" +
                    "    <h1>Vietnamese Dictionary</h1>\n" +
                    "    <form method=\"get\" action=\"/translate\">\n" +
                    "      <div class=\"row\">\n" +
                    "        <div class=\"col\">\n" +
                    "          <input type=\"text\" class=\"form-control\" name=\"inputWord\" placeholder=\"Input here...\">\n" +
                    "        </div>\n" +
                    "        <div class=\"col\">\n" +
                    "          <input class=\"form-control\" type=\"text\" name=\"resultWord\" placeholder=\"Result\" value=\"" + result + "\" readonly>\n" +
                    "        </div>\n" +
                    "      </div>\n" +
                    "      <input class=\"btn btn-primary\" style=\"margin-top: 10px\" type=\"submit\" value=\"Search\">\n" +
                    "    </form>\n" +
                    "  </div>\n" +
                    "  </body>\n" +
                    "</html>");
        }
    }
}
