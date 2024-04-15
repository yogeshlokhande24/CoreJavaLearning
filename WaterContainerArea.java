package concepts.leetcode.list;

public class WaterContainerArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hight = {1,8,6,2,5,4,8,3,7};
		
		int result = calculateArea(hight);
		System.out.println(result);
	}

	private static int calculateArea(int[] hight) {
		
		int maxArea=0;
		int aPointer = 0;
		int bPointer = hight.length -1;
		
		while(aPointer < bPointer) {
			if(aPointer < bPointer) {
				maxArea = Math.max(maxArea, hight[aPointer] * (bPointer -aPointer));
				aPointer +=1;
			}else {
				maxArea = Math.max(maxArea, hight[bPointer] * (bPointer -aPointer));
				bPointer -=1;
			}
		}
		return maxArea;
		
	}

}
