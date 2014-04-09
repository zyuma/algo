def search_sorted_MxN_matrix(matrix, target):
	if(len(matrix) == 0):
		return False
	elif(len(matrix) == 1):
		return target in matrix[0]
	for i in range(len(matrix))[1:]:
		if(matrix[i][0] > target):
			if(target > matrix[i-1][len(matrix[0])-1]):
				return False
			else:
				return target in matrix[i-1]
	return target in matrix[len(matrix)-1]

matrix = [[1,3,5,7], [10,11,16,20], [23,30,34,50]]
print search_sorted_MxN_matrix(matrix, 11)
print search_sorted_MxN_matrix(matrix, 1)
print search_sorted_MxN_matrix(matrix, 30)
print search_sorted_MxN_matrix(matrix, 9)

matrix2 = [[44,55,77,99]]
print search_sorted_MxN_matrix(matrix2, 44)

matrix3 = []
print search_sorted_MxN_matrix(matrix3, 11)
