class P307{
	public static void main(String[] args){
		int star =7;
		int space=0;
		
		
		for(int i=1;i<=4;i++){
			int n=1;
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(n);
			
				if((star/2)>=j){
					n++;
				}
				else{
					n--;
				}
			}
			
				
				star-=2;
				space++;
				
			
				
			System.out.println();
		}
	}
}                           