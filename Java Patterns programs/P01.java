class P01{
	public static void main(String[] args){
		char ch='a';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==j||i+j==6){
					System.out.print(ch++);
					if(ch=='e')
						ch++;
				}
			
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}