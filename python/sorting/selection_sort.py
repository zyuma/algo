def selection_sort(arr):
	for i in range(len(arr))[:len(arr)-1]:
		smallest_index = i
		done = True
		for j in range(len(arr))[i+1:]:
			if arr[i] > arr[j]:
				smallest_index = j
		if smallest_index != i:
			temp = arr[smallest_index]
			arr[smallest_index] = arr[i]
			arr[i] = temp
			done = False
		if done: return
		print arr
	return

arr = [5,4,3,2,1]
selection_sort(arr)
print arr
