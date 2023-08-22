class P211{
	public static void main(String[] args){
		
		
		for(int i=1;i<=5;i++){
			char ch='a';
			
			for(int j=5;j>=i;j--){
				if(i%2==0){
					System.out.print(ch++);
				}
				else{
					System.out.print(j);
				}
				
			}
			
			System.out.println();
		}
	}
}                           