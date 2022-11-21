<%@page contentType="text/html" pageEncoding="UTF-8"%> 

<div class="center">
    <div class="left">    
        <h1>Add Products</h1>        
        <form method="post" id="frm1" action="addbackend.jsp" enctype="multipart/form-data">
            <div class="txtarea">
                <label for="pname" class="lbl">Name</label>
                <input type="text" id="pname" class="tb" placeholder="dinesh" name="pname">
            </div>
            <div class="txtarea">
                <label for="price" class="lbl">price</label>
                <input type="text" id="price" class="tb" name="price">
            </div>
            <div class="txtarea">
                <label for="pinfo" class="lbl">info</label>
                <input type="text" id="pinfo" class="tb" name="pinfo">
            </div>
            <div class="txtarea">
                <label for="p" class="lbl">file</label>
                <div class="tb"></div>
                <input type="file" hidden name="fileinput" class="tb" id="finput" multiple="true" accept=".jpg"/><br/>
            </div>
            <center><input class="tb button" type="submit"></center>
        </form>
    </div> 
    <div class="right">

        <img class="showimage" src="" alt="ok">
        <img class="showimage" src="" alt="ok">
        <img class="showimage" src="" alt="ok">
        <img class="showimage" src="" alt="ok">
        <img class="showimage" src="" alt="ok">
        <img class="showimage" src="" alt="ok">
    </div>
</div>
<script>
    let fileinput = document.getElementById('finput');
    let imgtag = document.getElementsByClassName('showimage');
    fileinput.addEventListener("onchange", showimg());
    function showimg() {
    if (fileinput.files.length > 0) {
    for (let i = 0; i < fileinput.files.length; i++) {
    imgtag[i].src = URL.createObjectURL(fileinput.files[i]);
    }
    if (fileinput.files.length < 5 || fileinput.files.length < 5) {
    alert('enter 6 files');
    }
    if (fileinput.files.length == 6) {
    val = 0;
    }
    }
    };
</script>
