
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"
    integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
   
    <title>Login Form </title>
   
    

    <link rel="stylesheet" href="<c:url value='/resources/css/index.css' />">
    <script src="<c:url value='/resources/js/jquery.js' />"></script>
  
 
    
    
       <h1 id="ak" >AKKA UNIVERSITY</h1>
       <h1 id="l">Login</h1>
</head>

<body>
   
    <div id="d1">
        <div id="dd1">
            <form action="/login" method="post">

                <input type="text" id="in" name="u_name" placeholder="User ID" /><br />
                <input type="password" id="out" name ="pass" placeholder="Password" /><br/>
               
                <center>
                    <button id="log" type="submit" onclick="login()" >LOGIN</button>
                </center>  
                <br>
                <a href="/signup" id="sb1">sigin in</a> <br>
             
            </form>
            
            
        </div>
    </div>


    
    
    <head>

        
    
    </head>
</body>

</html>