/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.

*/

public class Solution {
    public boolean canJump(int[] A) {
		int jump = 0, jump_prev = 0;
		while (jump < A.length-1){
			if(A[0] == 0) return false;
			while(A[jump] == 0){
				jump -= 1;
				if (jump == jump_prev){
					return false;
				}
			}
			jump_prev = jump;
			jump += A[jump];
		}
		return true;
	}
}
