package webbasedgraphtesting;


import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import org.apache.commons.fileupload.FileItemFactory;
import static webbasedgraphtesting.ReadAndWriteExcelFile.readXLSFile;


public class UploadFile extends HttpServlet {
   
    public  String uploadedfile ="";
   
    private static final long serialVersionUID = 1L;
        private final String UPLOAD_DIRECTORY = "C:/temp/saved";

        protected void doPost(HttpServletRequest request,
                HttpServletResponse response) throws ServletException, IOException {
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);

        String passname="";
        // process only if its multipart content
        if (isMultipart) {
                // Create a factory for disk-based file items
                FileItemFactory factory = new DiskFileItemFactory();

                // Create a new file upload handler
                ServletFileUpload upload = new ServletFileUpload(factory);
                try {
                    // Parse the request
                    List<FileItem> multiparts = upload.parseRequest(request);

                   for (FileItem item : multiparts) {
                   if (!item.isFormField()) {
                   String name = new File(item.getName()).getName();
                   passname= name;
                   uploadedfile = UPLOAD_DIRECTORY + File.separator + name;
                   item.write(new File(UPLOAD_DIRECTORY + File.separator + name));
                   }
                }
                readXLSFile(uploadedfile);
                // File uploaded successfully
                request.setAttribute("message", passname+ " has been uploaded!");
                } 
                catch (Exception e) 
                {
                 request.setAttribute("message", "File Upload Failed due to " + e);
                }
        } else 
        {
        request.setAttribute("message", "This Servlet only handles file upload request");
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
}

    }
   