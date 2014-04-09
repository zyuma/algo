def bubble_sort(arr):
	for i in range(len(arr)):
		print i
		done = True
		for i in range(len(arr))[:len(arr)-1]:
			if arr[i] > arr[i+1]:
				temp = arr[i]
				arr[i] = arr[i+1]
				arr[i+1] = temp
				done = False
			print arr
		print done
		if done:
			return 

arr = [5,4,3,2,1]
bubble_sort(arr)
print arr
