class P202{
	public static void main(String[] args){
		int space=0;
		for(int i=1;i<=4;i++){
			for(int k=1;k<=space;k++){
					System.out.print(" ");
				}
				
			for(int j=4;j>=i;j--){
				
			
					System.out.print("*");
				
				
			
			}
			space++;
			System.out.println();
		}
	}
}                           