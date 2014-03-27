def uniqueChar(string):
	dic = {}
	for char in string:
		if char not in dic:
			dic[char] = 1
		else:
			return False
	return True

def uniqueChar2(string):
	for i in range(len(string)):
		for j in range(len(string))[i+1:]:
			if string[i] == string[j]:
				return False
	return True

print uniqueChar2("yuma")
print uniqueChar2("yumayuma")
print range(5)
print range(5)[2:]
print range (5)[2::-1]
