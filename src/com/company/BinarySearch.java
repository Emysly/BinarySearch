package com.company;

//Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
//
//In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array using Arrays.sort(arr) method.

class BinarySearch {
    public static void binarySearch(int arr[], int key){
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println(mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println(-1);
        }
    }
    public static void main(String args[]){
        binarySearch(new int[]{10,20,30,40,50},30);
    }
}
