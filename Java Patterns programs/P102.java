class P102{
	public static void main(String[] args){
		int n=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=4;j++){
				if(j%2==0)
					System.out.print(ch);
				else
					System.out.print(n);
				
			}
			System.out.println();
		}
	}
}                           