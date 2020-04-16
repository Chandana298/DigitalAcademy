<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Employee Registration!!</title>
      <style>
         .error {
         color: red
         }
      </style>
   </head>
   <body>
      <form:form action="processForm" modelAttribute="registration">
         <div align="center">
            <h2>Register Here</h2>
            <table>
               <tr>
                  <td>Employee name</td>
                  <td>
                     <form:input type="text" path="Empname" />
                  </td>
                  <td>
                     <form:errors path="Empname" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Employee Id </td>
                  <td>
                     <form:input type="text" path="EmpId" />
                  </td>
                  <td>
                     <form:errors path="EmpId" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Employee Age </td>
                  <td>
                     <form:input type="text" path="Empage" />
                  </td>
                  <td>
                     <form:errors path="Empage" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Employee Address</td>
                  <td>
                     <form:input type="text" path="EmpAdd" />
                  </td>
                  <td>
                     <form:errors path="EmpAdd" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td>Employee Salary </td>
                  <td>
                     <form:input type="text" path="Empsal" />
                  </td>
                  <td>
                     <form:errors path="Empsal" cssClass="error" />
                  </td>
               </tr>
               <tr>
                  <td></td>
                  <td><input type="submit" value="Submit" /></td>
               </tr>
            </table>
         </div>
      </form:form>
   </body>
</html>