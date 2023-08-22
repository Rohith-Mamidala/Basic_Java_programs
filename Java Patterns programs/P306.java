class P306{
	public static void main(String[] args){
		int star =1;
		int space=3;
		
		
		for(int i=1;i<=4;i++){
			char ch='A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(ch);
				if(i>j){
					ch++;
				}
				else{
					ch--;
				}
			}
			
				
				star+=2;
				space--;
				
			
				
			System.out.println();
		}
	}
}                           