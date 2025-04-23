//let's makea guessing game
const max = prompt("Enter the maximum number");

const random = Math.floor(Math.random() * max + 1);
console.log(random); 

let guess = prompt("guess a number");
console.log(guess);

while(true){
    if(guess == "quit"){
        console.log("quitting the game");
        break;
    }
    if(guess == random){
        console.log(`Congrats!! your guess is correct, which is ${guess}`);
        break;
    }else if(guess < random){
        guess = prompt("your guess is too small, please try again with a larger number");
    }else{
        console.log("your guess is too large, please try with again with a smaller number");
    }
}