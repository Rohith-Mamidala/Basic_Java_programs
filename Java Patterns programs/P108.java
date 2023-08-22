class P108{
	public static void main(String[] args){
		char ch='A';
		int n=1;
		
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				
				if(i==3||j==3){
					System.out.print("#");
				}
				else if(j%2==0){
					System.out.print(ch++);
					
				}
				
				else{
					System.out.print(n++);
					
				}
				
			}
			System.out.println();
		}
	}
}                           