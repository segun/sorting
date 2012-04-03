def insertion_sort(l):
	for i in range(1, len(l)):
		key = l[i]
		x = i
		y = i - 1

		while y >= 0:
			if l[x] < l[y]:
				t = l[x]
				l[x] = l[y]
				l[y] = t
			else:
				break
			x -= 1
			y -= 1

	print l

def selection_sort(l):
	for i in range(0, len(l)):
		smallest = l[i]
		smallest_index = i
		for j in range(i+1, len(l)):
			if l[j] < smallest:
				smallest = l[j]
				smallest_index = j

		if i != smallest_index:
			t = l[i]
			l[i] = l[smallest_index]
			l[smallest_index] = t

	print l

def bubble_sort(l):
	swapped = True
	while swapped:
		swapped = False
		i = 0
		j = i + 1
		while j < len(l):
			if l[i] > l[j]:
				t = l[i]
				l[i] = l[j]
				l[j] = t
				swapped = True

			i += 1
			j += 1

	print l

def merge_sort(l):
	if len(l) == 1:
		return l

	mid = len(l)/2
	left = merge_sort(l[0:mid])
	right = merge_sort(l[mid:])

	nl = []
	li = 0
	ri = 0
	while True:
		if li == len(left):
			nl += right[ri:]
			break

		if ri == len(right):
			nl += left[li:]
			break

		if left[li] <= right[ri]:
			nl.append(left[li])
			li += 1
		else:
			nl.append(right[ri])
			ri += 1

	print nl
	return nl


def quick_sort(l):
	if len(l) <= 1:
		return l

	mid = len(l)/2
	pivot = l[mid]

	left = []
	right = []
	i = 0
	while i < len(l):
		if i != mid:
			if l[i] <= pivot:
				left.append(l[i])
			else:
				right.append(l[i])

		i += 1

	return quick_sort(left) + [pivot] + quick_sort(right)





l = quick_sort([9,7,1,3,5,8,62,4,0,3,131,2,1])
print l
