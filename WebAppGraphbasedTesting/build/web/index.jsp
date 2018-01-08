<%-- 
    Document   : index
    Created on : 05.Oca.2018, 12:21:43
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<p style="text-align:center;font-size:150%;font-weight:bold">Graph Based Testing Algorithm 1 </p>

<table id = "tableForm" border="1" width="100%" cellspacing="0" cellpadding="0"  bgcolor="#ffccff">
<tr>
  <td width="33%">
    <table border="0">
      <tr align="center">
        </tr>
	 <tr><td>
     
      </td></tr>
      <tr align = center>
        <td>
          <p> &nbsp;</p>

      <form action = "UploadFile" method = "post"
         enctype = "multipart/form-data">
         <input type = "file" name = "file" size = "100" />
         <br />
         <input type = "submit" value = "Upload File" />
      </form>
<p style="text-align:left;font-weight:bold">${requestScope.message} </p>
       

        </td>
      </tr>
		

</table>
  </td>
</tr>
</table>
<table width="100%">
<tr><td></tr> <tr><td></tr>
<tr><td></tr> <tr><td></tr>
<tr>

<tr><td></tr> <tr><td></tr>
<tr>
  <td align=right width = "15%"><b>Test Paths:</b></td>
 <td width="85%" colspan="3"> Algorithm 1: Slower, more test paths, shorter test paths	
  <form action = "Download" method = "post"
         enctype = "multipart/form-data">
  &nbsp;<input type="submit" value="Prime Path Coverage" name="action">
  </form>
   </td>
</tr>
<tr>
  <td align=right width = "15%"></td>

</body>
</html>