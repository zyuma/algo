def reverse(string):
	newstr = ""
	for i in string[:-1]:
		newstr = i + newstr
	return newstr

def reverse2(string):
	arr = []
	arr.extend(string)
	print arr
	for i in range(len(arr)/2):
		arr[i], arr[len(arr)-2-i] = arr[len(arr)-2-i], arr[i]
	return arr

test = "yuma\n"
print reverse(test)
print reverse2(test)
