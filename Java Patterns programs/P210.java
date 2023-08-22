class P210{
	public static void main(String[] args){
		
		int space =0;
		for(int i=1;i<=5;i++){
			char ch='e';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--){
				
					System.out.print(ch--);
				
			}
			space++;
			
			System.out.println();
		}
	}
}                           