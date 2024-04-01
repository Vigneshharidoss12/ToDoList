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
height: 400px;
width: 400px;
margin-left: 500px;
margin-top: 150px;
}
#div2{
display: flex;
text-align: center;
line-height: 50px;
}

</style>
</head>
<body>

<div id="div1">
<form action="saveuser" method="post" enctype="multipart/form-data">
<div id="div2">


<section id="sec1">
 <label > Userid: </label>
 <br>
  <label > Username: </label>
   <br>
   <label > Useremail: </label>
    <br>
    <label > Usercontact: </label>
     
      <br>
      <label > Userpassword: </label>
<br>
     <label > Userimage: </label>

</section>

<section id="sec2">
<input name="userid" type="text"></input>
 <br>
<input name="username" type="text"></input>
 <br>
<input name="useremail" type="email"></input>
 <br>
<input name="usercontact" type="number"></input>
 
 <br>
<input name="userpassword" type="password"></input>
<br>
<input name="userimage" type="file"></input>


</section>

 
</div>

<input name="submit" type="submit"></input>



</form>

</div>

</body>
</html>