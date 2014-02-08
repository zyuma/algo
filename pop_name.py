name_file = open('yob1995.txt', 'r')
num = 0
fir = ''
sec = ''
for line in name_file:
	print line
	arr = line.rstrip().split(',')
	print arr
	if int(arr[2]) > num and arr[1] == 'F':
		sec = fir
		fir = arr[0]
		num = int(arr[2])

print fir, num
print sec

name_file.close()

