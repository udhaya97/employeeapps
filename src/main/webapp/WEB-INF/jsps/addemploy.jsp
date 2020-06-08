<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
  
        
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My App</title>

<style type="text/css">

 .error {color:red;}  
</style>
</head>
 
<body>
<div align="right"><a href="./listEmployee">Home</a><a href ="./">Logout</a></div>
<div align ="center">
<h1>Add New Employee</h1> 
       <form:form action="./saveEmployee" modelAttribute="emplo">   
       
       <form:hidden path="empId"/> 
        <table >  
        
         <tr>    
          <td>EmployeeName : </td>   
          <td><form:input path="empName" /></td>  
         </tr>    
         <tr><td></td><td><form:errors path="empName" cssClass="error"/></td>
         <tr>    
         
          <td>Salary :</td>    
          <td><form:input path="sal"  /></td>  
         </tr>   
         <tr><td></td><td><form:errors path="sal" cssClass="error"/></td>
         <tr>    
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation"  /></td>  
         </tr>   
         <tr><td></td><td><form:errors path="designation" cssClass="error"/></td>
         <tr>    
         <tr>    
          <td>DOB :</td>    
          <td><form:input path="dob" type="date"  /></td>  
         </tr>   
         <tr><td></td><td><form:errors path="dob" cssClass="error"/></td>
         <tr>    
         <tr>    
          <td>CompanyName :</td>    
          <td><form:input path="companyName"  /></td>  
         </tr>   
          <tr><td></td><td><form:errors path="companyName" cssClass="error"/></td>
         <tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save"/>    
         </tr>    
        </table>    
       </form:form>   </div>
</body>
</html>