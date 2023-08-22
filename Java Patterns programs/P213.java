class P213{
	public static void main(String[] args){
		int n=1,n1=n;
		
		for(int i=1;i<=4;i++){
	
			for(int j=1;j<=i;j++){
				
					System.out.print(n--);
				}
				n1+=2;
				n+=n1;
			System.out.println();
		}
	}
}                           