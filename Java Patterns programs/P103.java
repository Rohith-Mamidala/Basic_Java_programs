class P103{
	public static void main(String[] args){
		int n=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			
			for(int j=1;j<=5;j++){
				if(j%2==0)
					System.out.print(n++);
				else if(j==3){
					System.out.print("+");
				}
				else
					System.out.print(ch++);
				
			}
			System.out.println();
		}
	}
}                           