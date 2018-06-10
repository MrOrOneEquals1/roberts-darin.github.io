function changePictureWidth() {
    var picWidth = document.getElementById("picWidth").value;
    document.getElementById("myPic").style.width = picWidth + '%'; 
}

function changeFontSize() {
    document.getElementById("fontChange").style.fontSize = "20px";
}

function changeFontColor() {
    var colorValue = document.getElementById("fontColor").value;
    document.getElementById("fontChange").style.color = colorValue;
}

function clearItems() {
    window.localStorage.clear();
    location.reload();
}

function adjustPercentage(percentage) {
    document.getElementById("sliderOutput").innerHTML = percentage + '%';
}

function changeButtons() {
    var x = document.getElementsByClassName("myButtons");
    for (var i = 0; i < x.length; i++) {
      x[i].style.borderRadius = "6%";  
    }
}