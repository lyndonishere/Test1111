//This is just an example of using a for loop to append the value of the loop condition to the end of a string then printing 
stringCHAIN = "0"
for( x = 1; x<=20; x++){
    console.log(stringCHAIN)
    stringCHAIN = stringCHAIN + "   " + x.toString()
}


//This is an intialization of an array with 4 rows with empty columns
cardDECK = [[],[],[],[]]
console.log(`\nThe code will now intialize an array and append values to them\n`)
//This goes through each row in the array
for(x = 0; x < 4; x++){
    //This goes through the coloumns of each row and adds the value of y+1 to the spot
    for(y = 0; y<13; y++){
        cardDECK[x][y] = (y+1)
    }
}

for(x = 0; x < 4; x++){
    console.log(cardDECK[x].toString())
}

console.log(`\nThe Array Elements will now be filled with 1's\n`)

for(x = 0; x < 4; x++){
    for(y = 0; y<13; y++){
        cardDECK[x][y] = (1)
    }
}

for(x = 0; x < 4; x++){
    console.log(cardDECK[x].toString())
}


// console.log(cardDECK)
// console.log(cardDECK[0])
// console.log(cardDECK[0][0])
// console.log(cardDECK[0].toString())




newARRAY = [[],[]]
newARRAY[0].push(1)
newARRAY[0].push(2)
newARRAY[1].push(3)
newARRAY[1].push(4)
console.log(newARRAY)
newARRAY[0].push(1)
newARRAY[0].push(2)
newARRAY[1].push(3)
newARRAY[1].push(4)
console.log(newARRAY)