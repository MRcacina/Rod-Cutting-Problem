/**
 * 
 * @author Mert CACINA
 *
 */


public class RodCutting {

	/**
	 *  Main method
	 * 
	 */
    public static void main(String[] args) {
    	
        int[] prices = { 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };
        
        int lengthToCheck = 4;
        
        int result = bestChoice(prices,lengthToCheck);
        
        System.out.println("For the length " + lengthToCheck + 
        		" max profit we are able to make is : " + result);

    } // End of main.
    
    

    public static int bestChoice (int[] prices, int index) {
        
    	int[] temp = new int[index + 1];
        
        temp[0] = 0;

        for (int i = 1; i <= index; i++) {
        	
            int max = -1;
            
            for (int j = 0; j < i; j++) {
                max = Math.max(max, prices[j] + temp[i - (j + 1)]);
                temp[i] = max;
            }
            
        }
        
        return temp[index];
    }



} // End of class.
