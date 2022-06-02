nameFULL = 'Lyndon Sully'
qouteSTRING = 'The quick brown fox jumps over the lazy dog'
vowelCOUNT1 = 0
constCOUNT1 = 0
wordCOUNT1  = 1

vowelCOUNT2 = 0
constCOUNT2 = 0
wordCOUNT2  = 1


for (let x of nameFULL){
    if(x === 'a'||x === 'e'||x === 'i'||x === 'o'||x === 'u'){
        vowelCOUNT1++;
    }else if(x == ' '){
        wordCOUNT1++;
    }else if(x != 'a'||x != 'e'||x != 'i'||x != 'o'||x != 'u'||x != ' '){
        constCOUNT1++;
    }else{
        null
    }
}

for (let x of qouteSTRING){
    if(x === 'a'||x === 'e'||x === 'i'||x === 'o'||x === 'u'){
        vowelCOUNT2++;
    }else if(x == ' '){
        wordCOUNT2++;
    }else if(x != 'a'||x != 'e'||x != 'i'||x != 'o'||x != 'u'||x != ' '){
        constCOUNT2++;
    }else{
        null
    }
}
console.log('\n')
console.log(`In the name:\n`+nameFULL+`\nThere are `+wordCOUNT1+` word(s), `+ vowelCOUNT1.toString()+` vowel(s) and `+constCOUNT1.toString()+ ' consonant(s)\n\n')
console.log(`In the sentence:\n`+qouteSTRING+`\nThere are `+wordCOUNT2+` word(s), `+ vowelCOUNT2.toString()+` vowel(s) and `+constCOUNT2.toString()+ ' consonant(s)\n\n')


// console.log(vowelCOUNT1)
// console.log(constCOUNT1)
// console.log(wordCOUNT1)