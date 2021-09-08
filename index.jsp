<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
function check() {
	  // Get the value of the input field with id="num"
	  let x = document.getElementById("num").value;
	  
	// Validate x is alphnumeric or 0
	  if (isNaN(x) || x < 1) {
		alert("Input not valid, enter number greater than 0")
	    return false
	  } 
	  
	  return true
	}
function check1() {
	  // Get the value of the input field with id="seq"
	  let x = document.getElementById("seq").value;
	  
	 // Validate x is alphnumeric or 0
	  if (isNaN(x) || x < 1) {
		alert("Input not valid, enter number greater than 0")
	    return false
	  } 
	   
	  return true
	}
</script>
</head>
<style>
input[type=text], select {
  width: 30%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  
}

input[type=submit] {
  width: 10%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}</style>
<body>

<div>
<form method=post onSubmit=" return check();" action="LookAndSaySequence">
<label>Enter number to display look and say sequence :</label>
<input  type="text"   name="num"  id="num"  pattern="[0-9]+"  title="Only numericals are allowed i.e >0"/> 
<input  type="submit" name="btn1" id="btn1" value="Display Sequence"/>
</form>
</div>

 <div>
 <form method=post  onSubmit="return check1();"action="NextLook">
<label>Enter number to calculate look and say number :</label>
<input type="text"   name="seq"  id="seq"  pattern="[1-9]+"  title="Only numericals are allowed"/> 
<input type="submit" name="btn2" id="btn2" value="Calculate"/>
</form>

</div>
<!--  <textarea id="display" name="display" "rows="4" cols="50" value=display() " ></textarea>-->
</body>
</html>