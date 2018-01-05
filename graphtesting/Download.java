
package webbasedgraphtesting;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;


public class Download extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
        startDownload(request, response);
    }
 
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
        startDownload(request, response);
    }
 
    public void startDownload(HttpServletRequest request,
        HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
 
        File file = new File("c:/temp/result.xls");
 
        ServletOutputStream stream = null;
        BufferedInputStream buf = null;
        try {
            stream = response.getOutputStream();
            // set response headers
            response.setContentType("application/excel");
            response.setDateHeader("Expires", 0);
            response.addHeader("Content-Disposition",
                "attachment; filename=result.xls");
            response.setContentLength((int) file.length());
            buf = new BufferedInputStream(new FileInputStream(file));
            int readBytes = 0;
            while ((readBytes = buf.read()) != -1)
                stream.write(readBytes);
        } finally {
            if (stream != null)
                stream.flush();
            stream.close();
            if (buf != null)
                buf.close();
        }
    }
}
