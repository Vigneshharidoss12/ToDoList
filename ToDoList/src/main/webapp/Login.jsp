<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style >
#div1{
border:2px solid black;
height: 300px;
width: 300px;
margin-left: 500px;
margin-top: 150px;
}
#div2{
display: flex;
text-align: center;
line-height: 30px;
}

</style>
</head>
<body>
 
 
 
<div id="div1">
<form action="userlogin" method="post" >
<div id="div2">


<section id="sec1">
 
   <label > Useremail: </label>
    <br>
      <br>
      <label > Userpassword: </label>


</section>

<section id="sec2">

<input name="useremail" type="email"></input>
 <br>

 <br>
<input name="userpassword" type="password"></input>



</section>

 
</div>

<input name="submit" type="submit"></input>



</form>

</div>
 
 
 
</body>
</html>