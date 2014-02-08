def remove_dup(string):
	i = 0
	arr = []
	arr.extend(string)
	arr.sort()
	print arr
	while i < len(arr)-1:
		print len(arr)-1
		while i < len(arr)-1 and arr[i] == arr[i+1]:
			del arr[i+1]
		i+=1
		print arr
	return arr

test = 'aabbecccaddeeceee'
print remove_dup(test)

