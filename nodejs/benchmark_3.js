var x=[];
start = new Date().getTime();
for (var i = 0; i < 100000; i++) {
  x["x"+i] = i/10;
}
var end = new Date().getTime();
var total_time = end-start;
console.log("Total time="+total_time+"ms");