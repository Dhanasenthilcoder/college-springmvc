<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"
    integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

   

 
    <link rel="stylesheet" href="<c:url value='/resources/css/student.css' />">
    <script src="<c:url value='/resources/js/jquery.js' />"></script>
 
</head>

<body onload="name()">
  <div id="top"> Student portal <button id="logout" onclick="logout()">logout</button> <br></div>


  <div id="std">
   
    <img id="userpng" src="user png.png" alt="user_img">
    <h1 id="name"></h1>
 
    <button id="aa" type="button" onclick="getCollegeSeatList()"> college seat list</button>
    <button id="aa" type="button" onclick="getStudentStatusonload()"> Application Status </button>
   
  </div>
  <div id="std1">
    <div id="csl">
      <div id="cslform">
        <form action="collegeseatlist" method="post" >
          <!-- COLLEGE ID <input type="text" name="co_id" id="co_id">
          COURSE ID<input type="text" name="c_id" id="c_id"> -->
          <label id="fla" name="c_name" for="c_name">COLLEGE NAME : </label>
            <select name="c_name" id="c_name">
              <option value="NANDHA ENGINEERING COLLEGE">NANDHA ENGINEERING COLLEGE</option>
              <option value="BANNARIAMMAN ENGINEERING COLLEGE">BANNARIAMMAN ENGINEERING COLLEGE</option>
              <option value="KOUNGU ENGINEERING COLLEGE">KOUNGU ENGINEERING COLLEGE</option>
              <option value="KG COLLEGE">KG COLLEGE</option>
              <option value="SAKTHI ENGINEERING COLLEGE">SAKTHI ENGINEERING COLLEGE</option>
            </select>
            <br>
            <label id="fla" name="co_name" for="co_name">COURSE NAME : </label>
            <select name="co_name" id="co_name">
              <option value="MECH">MECH</option>
              <option value="CIVIL">CIVIL</option>
              <option value="ECE">ECE</option>
              <option value="EEE">EEE</option>
              <option value="CSE">CSE</option>
              <option value="IT">IT</option>
            </select>
            <br>

            <button type="submit" onclick="displaySeatList()" >Search</button>
        </form>
      </div>
      

      <div id="csltable">
        <table border="1px">
          <thead>
            <tr>
              <th>COLLEGE NAME</th>
              <th>COURSE NAME </th>
              <th>COLLEGE ID</th>
              <th>FILLED SEATS</th>
              <th>REMAINING SEATS</th>
              <th>TOTAL SEATS</th>
            </tr>
          </thead>

          <tbody id="sea"></tbody>
        </table><br>
       <center><button onclick="redirectStudent()">HOME</button></center> 
      </div>

    </div>
    <div id="status">
      <table border="1px">
        <thead>
          <tr>
            <th>APPLICATION ID</th>
            <th>STUDENT NAME </th>
            <th>ALLOTMENT ID</th>
            <th>STATUS</th>
          </tr>
        </thead>

        <tbody id="sta"></tbody>
      </table><br>
      <center><button onclick="redirectStudent()">HOME</button></center>
    </div>

   
  </div>
</body>

</html>