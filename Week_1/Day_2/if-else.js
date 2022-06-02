/*
Boolean statements:

Will exceute if statement
if(true){

}

Will not exceute if statement
if(false){

}
*/
//Working For loop for an Array of size 10
numberLIST = Array(10)
numberLISTlength = numberLIST.length
for (x=0; x < numberLISTlength; x++){
    numberLIST[x] = x
    console.log(numberLIST[x])
}


numberLIST[4] = 73
console.log(numberLIST)
