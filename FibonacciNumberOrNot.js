i = 0;

j = 1;

k = 54;

while(k > j){
    let temp = j;
    j += i;
    i = temp; 
    console.log(j);
    if (k == j) {
        console.log(true);
    }
    if (j > k) {
        console.log(false);
    }
}