<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset-UTF8">
    <link href="<c:url value="/css/styles.css"  />" rel="stylesheet">
    <title>Felvétel</title>
</head>

<body id="contentbody">
<header id="header">
    <div class="logo shadows">Vodka DB <a href="https://github.com/GergoSz"><span>Szabó Gergely - B5XVY7</span></a></div>
</header>

<span style="font-size:30px;cursor:pointer" onclick="openNav()" class="menubutton">&#9776; </span>
<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
    <a href="/createvodka" class="menuButton">1. Add vodka </a>
    <a href="/vodka" class="menuButton">2. List vodka </a>
</div>

    <section id="sect1" class="sec-wrap inner">


        <div class="section-header">
            <h2>Details</h2>
        </div>

        <div class="content">
            <form action="/vodka" method="post">

                  <p> Brand: <span><input type="text" name="brand" /></span></p>

                   <p>Name: <span><input type="text" name="name" /></span></p>

                  <p>Alcohol %:<span> <input type="text" name="alc" /></span></p>

                  <p>Volume: <span><input type="text" name="volume" /></span></p>

                  <p><input type="submit" name="vodka" value="Felvétel" /></p>



                <a href="/"><-- Vissza</a>
            </form>
        </div>
    </section>

<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/general.js"></script>
</body>

</html>