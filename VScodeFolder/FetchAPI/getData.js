var url ="http://localhost:3000/users";
function getDatafun(){
  //  alert("works good!!");
    fetch(url).then((response)=>{
        return response.json();
    }).then((data)=>{
        console.log(data);
        diplayData(data);
    }).catch((error)=>{
        console.log(error);
    })
}

function diplayData(data){
  //  alert("displaying data");
    var dataSection = document.getElementById("myData");
    dataSection.innerHTML = "";
    var myTable = document.createElement("table");
    for(i=0;i<data.length;i++){
        console.log('Name : '+data[i].name);
        var tableRow = document.createElement("tr");
        var idTag = document.createElement("td");
        var nameTag = document.createElement("td");
        var passTag = document.createElement("td");

        idTag.innerHTML = data[i].id;
        nameTag.innerHTML = data[i].name;
        passTag.innerHTML = data[i].password;

        tableRow.append(idTag);
        tableRow.append(nameTag);
        tableRow.append(passTag);
        myTable.append(tableRow);
    }
    dataSection.append(myTable);
}

async function submitData(){
    var userId = document.getElementById("userId").value;
    var userName = document.getElementById("userName").value;
    var userPass = document.getElementById("userPass").value;

    alert("hiiiii");

    let user = {id:userId,name:userName,password:userPass};

    let response = await fetch(url,{
        method:'POST',
        headers :{
            'content-Type' : "application/json"
        },
        body: JSON.stringify(user)
    });
    let result = await response.json();
}