#!/usr/bin/ruby

x=""
start_time = Time.now()

for i in 0...100000
  x = x + "x"
end

end_time = Time.now();
total_time = (end_time-start_time)*1000
print "Total time=",total_time,"ms"