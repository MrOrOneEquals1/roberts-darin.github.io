function clickCounter1() {
    if(typeof(Storage) !== "undefined") {
        if (localStorage.clickcount1) {
            localStorage.clickcount1 = Number(localStorage.clickcount1) + 1;
        } else {
            localStorage.clickcount1 = 1;
        }
        
        document.getElementById("result1").innerHTML = "Team 1: " + localStorage.clickcount1;
    } else {
        document.getElementById("result1").innerHTML = "Sorry, time to upgrade your browser";
    }
}

function clickCounter2() {
    if(typeof(Storage) !== "undefined") {
        if (localStorage.clickcount2) {
            localStorage.clickcount2 = Number(localStorage.clickcount2) + 1;
        } else {
            localStorage.clickcount2 = 1;
        }
        
        document.getElementById("result2").innerHTML = "Team 2: " + localStorage.clickcount2;
    } else {
        document.getElementById("result2").innerHTML = "Sorry, time to upgrade your browser";
    }
}


function clearItems () {
    window.localStorage.clear();
    location.reload();
}

function populatePerson () {
    var userclass1 = document.getElementById("class1").value;
    var userclass2 = document.getElementById("class2").value;
    var userclass3 = document.getElementById("class3").value;
    var userclass4 = document.getElementById("class4").value;
    
    var person = {class1: userclass1, class2: userclass2, class3: userclass3, class4: userclass4};
    
    localStorage.setItem('user', JSON.stringify(person));
    localStorage.setItem('browser-name', navigator.appCodeName);
    localStorage.setItem('browser-version', navigator.appVersion);
    localStorage.setItem('browser-cookies', navigator.cookieEnabled);
    
    document.getElementById("userOutput").innerHTML = "Your submission is complete";  
}

function setUser() {
    var user = JSON.parse(localStorage.getItem('user'));
    var browserName = localStorage.getItem('browser-name');
    var browserVersion = localStorage.getItem('browser-version');
    var browserCookies = localStorage.getItem('browser-cookies');

    document.getElementById("userOutput").innerHTML = "<b>First Class:</b> " + user.class1 + "<br><b>Second Class:</b> " + user.class2 + "<br><b>Class 3:</b> " + user.class3 + "<br><b>Fourth Class:</b> " + user.class4 + "<br><b>Browser Name:</b> " + browserName + "<br><b>Browser Version:</b> " + browserVersion + "<br><b>Browser Cookies Enabled:</b> " + browserCookies;
}