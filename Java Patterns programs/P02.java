class P02{
	public static void main(String[] args){
		int in=8;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==j||i+j==5){
					System.out.print(in--);
					
				}
			
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}