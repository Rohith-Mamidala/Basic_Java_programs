class P104{
	public static void main(String[] args){
		int n=1;
		char ch='a',c='i';
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				if(j%2==0){
					System.out.print(n++);
				}
				else if(i==5){
					
					if(j==3){
						System.out.print("+");
					}
					else{
					System.out.print(c++);
				}
				}
					
				
				else{
					System.out.print(ch++);
				}
			}
			System.out.println();
		}
	}
}                           