var test = 5;
            var ipData = new XMLHttpRequest();
            ipData.open({method: 'GET', url: 'http://whois.arin.net/rest/ip/8.8.8.8', headers: {
                'Accept': 'application/json' }
            });
            ipData.send();
            
            ipData.onreadystatechange = processRequest;
            
            function processRequest(e) {
                if ipData = ipData {
                var response = JSON.parse(xhr.responseText);
                alert(response);
                alert(test);
            }}
            
        });


/<span id=cidrLength></span>
    
     document.querySelector("#cidrLength").innerHTML = response.net.netBlocks.netBlock.cidrLength;


document.querySelector("#orgName").innerHTML = response.net.orgRef['@name'];