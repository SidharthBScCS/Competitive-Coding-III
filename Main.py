def quickSort(arr):
    if len(arr)<=1:
        return arr;
    pivot=arr[0];
    left=[];
    right=[];
    equal=[];
    for num in arr:
        if num<pivot:
            left.append(num);
        elif num>pivot:
            right.append(num);
        else:
            equal.append(num);
            
    return quickSort(left)+equal+quickSort(right);

arr=[4,3,2,1];
print(quickSort(arr));