class P209{
	public static void main(String[] args){
		char ch='a';
		int n=1;
		
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=i;j++){
				if(j%2!=0){
					System.out.print(n++);
				}
				else{
			
					System.out.print(ch++);
				}
				
				
			
			}
			
			
			System.out.println();
		}
	}
}                           