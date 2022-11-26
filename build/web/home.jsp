<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>home-page</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&family=Staatliches&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Blinker:wght@100;200;300;400;600;700;800;900&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Ubuntu+Mono:ital,wght@0,400;0,700;1,400;1,700&display=swap');

        body {
            margin: 0;
            padding: 0;
            /* overflow-x: hidden; */

        }

        * {
            font-family: "Staatliches";
        }

        h1 {
            font-size: 100px;
            color: black;
            letter-spacing: 1px;
            margin-bottom: 0;
            backdrop-filter: blur(10px);
        }

        .container {
            position: absolute;
            left: 140px;
            top: 170px;
            font-family: "Blinker";
            font-size: 50px;
            font-weight: 100;
            text-align: left;
        }

        center {
            text-align: left;
            height: 700px;
            /* width: 100%; */
        }

        a {
            font-weight: 100;
            color: black;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        .img {
            height: 500px;
            top: 110px;
            right: 50px;
            animation: bgchange 1s ease-in-out forwards;
        }

        @keyframes text {
            0% {
                left: 0;
                opacity: 0;
            }

            100% {
                left: 140px;
                opacity: 1;
            }

        }

        @keyframes bgchange {
            0% {
                top: 0;
                opacity: 0;
            }

            100% {
                opacity: 1;
                top: 110px;
            }
        }

        @keyframes featuredtxt {
            0% {
                left: -30px;
            }

            100% {
                left: 100px;
            }
        }

        @keyframes ftxthide {
            0% {
                left: 100px;
            }

            100% {
                left: -30px;
            }
        }

        .a {
            position: absolute;
        }

        .cardmain {
            height: 600px;
        }

        .featured {
            right: 100px;
        }

        .r {
            position: relative;
        }

        .cardmain {
            padding: 10px;
        }

        .cardmain h1 {
            font-weight: 600;
            font-family: "Blinker";
            font-size: 100px;
        }

        .cardmain h2 {
            font-family: "Ubuntu Mono";
        }

        .cardmain p {
            width: 900px;
            font-family: "Blinker";
            font-size: 25px;
            word-spacing: 2px;
        }

        .cardmain button {
            background: black;
            color: white;
            border: none;
            height: 30px;
            width: 100px;
        }

        .active {
            opacity: 0;
        }

        @keyframes reveal {
            0% {
                opacity: 0;
            }

            100% {
                opacity: 1;
            }
        }

        @keyframes hide {
            0% {
                opacity: 1;
            }

            100% {
                opacity: 0;
            }
        }

        @keyframes bghide {
            0% {
                opacity: 1;
                top: 110px;
            }

            100% {
                top: 0;
                opacity: 0;
            }
        }
        @keyframes fimage {
            0%{
                top:-50px;
            }
            100%{
                top: 10px;
            }
        }
        @keyframes fimghide {
            0%{
                top:10px;
            }
            100%{
                top:-50px;
            }
        }
    </style>
</head>

<body>
    <%@include file="navbar.html" %>
    <script>
        window.addEventListener("load", function () {
            document.getElementById("container").style.animation = "1.4s text ease-out forwards";
            document.getElementById("img").style.animation = "bgchange 1s ease-in-out forwards";
        })
        function reveal() {
            var reveals = document.getElementById("reveal");
            var windowHeight = window.innerHeight;
            var elementTop = reveals.getBoundingClientRect().top;
            var elementVisible = 300;
            if (elementTop < windowHeight - elementVisible) {
                reveals.classList.remove("active");
                reveals.style.animation = "reveal .5s ease-in-out forwards";
                document.getElementById("f").style.animation = "fimage 1s ease-in-out forwards";
                document.getElementById("txt").style.animation = "featuredtxt 1s ease-in-out forwards";

            } else {
                reveals.classList.add("active");
                reveals.style.animation = "hide .6s ease-in-out forwards";
                document.getElementById("f").style.animation = "fimghide 1s ease-in-out forwards";
                document.getElementById("txt").style.animation = "ftxthide 1s ease-in-out forwards";
            }
        }
        window.addEventListener("scroll", reveal);
        reveal();
    </script>
    <center>
        <div class="container" id="container">
            <h1>Optical Computers</h1>
            one stop solution for all computing needs
            <br>
            <a href="http://">Shop Now</a>
        </div>
    </center>
    <img id="img" src="css/cssimg/omen.png" class="img a" alt="" srcset="">
    <br><br>
    <br><br>
    <div class="cardmain r reveal" id="reveal">
        <div class="text a" id="txt">
            <h2>Featured</h2>
            <h1>Genesis by ORIGIN</h1>
            <p>Origin PC is now a maker of very fine, high-end performance computers that are often better known as
                high-end gaming computers.” The fallacy of course is the rigs are suitable for much more than just
                gaming,
                and the people who can afford them likely have time for week long journeys through the World of
                Warcraft</p>
            <button>Buy Now</button>
        </div>
        <img class="a featured" id="f" src="css/cssimg/origin-pc.jpg" alt="">

    </div>
</body>

</html>