var x=0;
start = new Date().getTime();
for (var i = 0; i < 10000000; i++) {
  x = x + 1;
}
var end = new Date().getTime();
var total_time = end-start;
console.log("Total time="+total_time+"ms");