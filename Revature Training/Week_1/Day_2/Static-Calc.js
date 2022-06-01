const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

VALA = 0
VALB = 0
opSelect = 0
finalAns = 0.0
finalAnsStr = " "

rl.question('What operation do you select? :\nSyntax will be A(opr)B= Answer\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n ' + 
            `5. Division Remainder\n 6. A to the Power of B\n`, function (name) {
    opSelect=(parseInt(name))
  rl.question('What value for A ? ', function (valA) {
    VALA=(parseInt(valA))
    rl.question('What value for B ? ', function (valB) {
        VALB=(parseInt(valB))
        
        if (opSelect == 1){
            finalAns = (VALA + VALB) 
            finalAnsStr = finalAns.toString()
        }else if (opSelect == 2){
            finalAns = (VALA - VALB)
            finalAnsStr = finalAns.toString()
        }else if (opSelect == 3){
            finalAns = (VALA * VALB)
            finalAnsStr = finalAns.toString()
        }else if(opSelect == 4){
            if (VALB == 0){
                console.log("please don't do that :| ....")
                rl.close();
            }else{
                null
            }
            finalAns = (VALA / VALB)
            finalAnsStr = finalAns.toString()
        }else if(opSelect == 5){
            if (VALB == 0){
                console.log("please don't do that :| ....")
                rl.close();
            }else{
                null
            }
            remainder = (VALA % VALB) 
            finalAns = parseInt(VALA / VALB) 
            finalAnsStr = (finalAns.toString() + " remainder " + remainder.toString())
        }else if(opSelect == 6){
            finalAns = (Math.pow(VALA, VALB)) 
            finalAnsStr = finalAns.toString()
        }else{
            console.log("Your answer could not be calculated")
        }
        rl.close();
      })
  });
});



rl.on('close', function () {
    if (opSelect == (4 || 5) && VALB == 0){
        console.log(`You tried to divide by 0 and the code will now terminate`)
        process.exit(0);
    }else if (opSelect < 0 || opSelect > 6){
        console.log(`You selected an incorrect operation and the code will now terminate`)
        process.exit(0);
    }else{
  console.log(`Your final answer is = ` + finalAnsStr)
  process.exit(0);
    }
});