#!/usr/bin/python

from datetime import datetime
 
x=""
start = datetime.now();

i = 0
while i < 100000:
  i = i + 1
  x = x + "x"
  
end = datetime.now();
total_time = (end.microsecond-start.microsecond)/1000
print "Total time="+str(total_time)+"ms"