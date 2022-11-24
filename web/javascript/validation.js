
let err="";
        function submit(){
        let submitbtn = document.addEventListener("click", function(){
        
        document.getElementById("signupfrm").submit();
        })

        }
function validation() {
//other remaining
validate = 0;
        x = document.getElementsByClassName("inpt");
        for (i = 0; i < x.length; i++) {
if (x[i].value == "") {
validate++;
        }
}
if (validate > 0) {
err += "please enter empty fields\n";
        }
//age validation
let age = document.getElementsByName('age');
        if (!isNaN(age.value) || !age.value < 1 || !age.value > 100) {
err += "please enter valid age \n";
        validate++;
        }
//    radio gender validation
var r = document.getElementsByClassName('rbtn');
        var a = 0;
        for (let i = 0; i < r.length; i++) {
if (r[i].checked) {
console.log('got ' + r[i].value);
        }
else {
a++;
        }
}
if (a == r.length) {
err += "please enter valid gender \n ";
        validate++;
        }
//mobile validation
let mobile = document.getElementById('mobileno');
        var mval = document.getElementById('mobileno').value;
        if (!isNaN(mobile) || !mval.length == 10 || mval == "" || !/[6-9]/.test(mval)) {
validate++;
        err += "please enter valid mobile number\n";
        }

//passwrd
let pass = document.getElementById('pwd').value;
        if (!pass.length > 7 || !/[0-9]/.test(pass) || !/[a-z]/.test(pass)) {
err += "please enter valid password which have numbers and characters \n";
        validate++;
        }
//email
var mail = document.getElementById('mail').value;
        var at = mail.search('@');
        var dot = mail.search(/\./);
        if (at < 2 || dot < 2 || mail == "") {
err += "please enter an valid email \n";
        validate++;
        }
if (validate == 1) {
return true;
        }
if (validate > 0) {
    alert(err);
    err="";
return false;
        }
return true;
        }