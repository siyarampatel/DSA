class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e = height.length-1;
        int maxArea = 0;
        while(s<e){
            int w = e-s;
            int area = 0;
            if(height[s]<height[e]){
                area = w*height[s];
                s++;
            }
            else{
                area = w*height[e];
                e--;
            }
            maxArea = Math.max(area,maxArea);
        }
    return maxArea;
    }
}