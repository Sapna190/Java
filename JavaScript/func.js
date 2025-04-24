// function rollDice(){
//     const roll = Math.floor(Math.random() * 6 + 1);
//     console.log(roll);
// }
// rollDice();

//create a function to print the multiplication of a table
// function printTable(n){
//     for(let i = n; i <= n*10; i + n){
//         console.log(i);
//     }
// }
// printTable(5);

//let's make a to do app
let todo = [];

    //make a request
let req = prompt("Enter your request");

    while(true){
        if(req == "quit"){
            console.log("quitting the app");
            break;
        }else if(req == "list"){
            console.log("----------");
            for(let i=0; i<todo.length; i++){
                console.log(i, todo[i]);
            }
            console.log("----------");
        }else if(req == "add"){
            let task = prompt("please add your task");
            todo.push(task);
            console.log("task added");
        }else if(req == "delete"){
            let idx = prompt("Enter the idx you want to delete");
            todo.splice(idx,1);
            console.log("task has been deleted");
        }else{
            console.log("you have made the wrong request");
        }
         req = prompt("enter you request");
    }