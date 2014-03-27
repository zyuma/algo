def reverse_words(s):
	if("".join(s.split()) == ""):
		return ""
	s_arr = s.split(' ')
	print s_arr
	i = 0
	while(i<len(s_arr)):
		if s_arr[i] == "":
			del s_arr[i]
		else:
			i += 1
	for i in range(len(s_arr)/2):
		temp = s_arr[i]
		s_arr[i] = s_arr[len(s_arr)-1-i]
		s_arr[len(s_arr)-1-i] = temp
	print s_arr
	s_rev = ""
	for word in s_arr:
		s_rev += word
		s_rev += " "
	return s_rev.strip()

print reverse_words("   1   3")


print "".join("testing this".split())

