class P101{
	public static void main(String[] args){
		int n=1;
		char ch='A';
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=4;j++){
				if(j%2==0)
					System.out.print(n++);
				else
					System.out.print(ch++);
				
			}
			System.out.println();
		}
	}
}                           