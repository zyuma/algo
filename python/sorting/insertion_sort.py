def insertion_sort(arr):
	for i in range(len(arr))[1:]:
		j = i
		temp = arr[i]
		while j > 0 and arr[j-1] > temp:
			arr[j] = arr[j-1]
			j -= 1
		arr[j] = temp
	return arr

arr = [5,4,3,2,1]
insertion_sort(arr)
print arr
