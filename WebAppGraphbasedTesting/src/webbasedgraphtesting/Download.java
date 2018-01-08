
package webbasedgraphtesting;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Download extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
        startDownload(request, response);
    }
 
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
        startDownload(request, response);
    }
 
    //Downloading method
    public void startDownload(HttpServletRequest request,
        HttpServletResponse response)
    throws javax.servlet.ServletException, java.io.IOException {
 
        //File is saved to the following directory as result.xls
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
