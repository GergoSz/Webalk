<%@ page language="java" contentType="text/html; charset=UTF8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W+C//DTD HTM 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset-UTF8">
    <link href="https://fonts.googleapis.com/css?family=Poppins" rel="stylesheet">
    <link href="<c:url value="/css/styles.css" />" rel="stylesheet">
    <title>Vodka</title>
</head>
    <body>
    <header id="header">
        <div class="logo shadows">Vodka DB <a href="https://github.com/GergoSz"><span>Szabó Gergely - B5XVY7</span></a></div>
    </header>

    <span style="font-size:30px;cursor:pointer" onclick="openNav()" class="menubutton">&#9776; </span>
    <div id="mySidenav" class="sidenav">
        <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
        <a href="/createvodka" class="menuButton">1. Add vodka </a>
        <a href="/vodka" class="menuButton">2. List vodka </a>
    </div>

    <section id="main" onclick="closeNav()"></section>


    <div id="section-container">

    </div>

        <section id="sect1" class="sec-wrap inner">


            <div class="section-header">
                <h2>Vodka list</h2>
            </div>

            <div class="content">


                <p>Select an option from the side nav.</p>

            </div>
        </section>


    <!--<footer>
        <h2 class="rainbow">GEI-Krém</h2>
        <p>SmidLaciBácsiaLegjobbaVilágonBestEU</p>
    </footer>-->
    <!-- <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>-->
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="js/general.js"></script>

    <!-- PLS Don't steal my shit template!  -GRG -->
    </body>
</html>