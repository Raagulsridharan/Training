// function doHomeWork(Subject,callBack){
//     console.log("Starting my "+Subject+" home work");
//     callBack();
// }

// function afterHomeWork(){
//     console.log("finished home work")
// }

// doHomeWork('Math',afterHomeWork);

function oneArgs(callBack){
    var sub = callBack();
    console.log(`Starting my ${sub} home work`);
}
function subject(){
    return 'Math';
}
oneArgs(subject);