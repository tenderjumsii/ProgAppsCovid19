import java.util.*;
public class Solutions {
	public static int mexican(int n, int k, int t) {
		if (t<=k) {
			return t;
		} else if (t>n) {
			return Math.max((k-t+n),0);
		} else {
			return k;
		}
	}

	

	 public int solution(int number) {
    
    int sum = 0;
    for(int x = 0; x < number; x++){
      
        if(x%3 == 0){
          if(x%5 == 0){
            sum = sum + x;
          }else{
            sum = sum + x;
          }
        }else if(x%5 == 0){
          if(x%3 == 0){
            sum = sum + x;
          }else{
          sum = sum + x;
          }
        }
        
    }//for loop
    
    return sum;
    
    
  }

  public static void TryConflict(){
  	System.out.print("Conflicter");
  }
}