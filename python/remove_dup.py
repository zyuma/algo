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

def remove_dup2(s):
	i=0
	arr=[]
	arr.extend(s)
	while i<len(arr):
		j=i+1
		while j<len(arr):
			if arr[i] == arr[j]:
				del arr[j]
			else:
				j+=1
		i+=1
	return arr

test = 'aabbecccaddeeceee'
print remove_dup(test)
print remove_dup2(test)

