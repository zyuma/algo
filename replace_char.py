def replace_char(old, new, string):
	arr = []
	arr.extend(string)
	for i in range(len(arr))[::-1]:
		if arr[i] == " ":
			del arr[i] 
			arr[i:i] = ['%', '2', '0']
	return arr

print replace_char(' ', '%20', 'Hello my name is Yuma')
