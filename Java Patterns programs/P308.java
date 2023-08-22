class P308{
	public static void main(String[] args){
		int star =1;
		int space=4;
		
		
		for(int i=1;i<=7;i++){
			char ch='A';
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print(ch);
			if((star/2)>=j){
				ch++;
			}
			else{
				ch--;
			}
				
			}
			if(i<4){				
				star+=2;
				space--;
			}
			else{
				star-=2;
				space++;
			}
			
				
			System.out.println();
		}
	}
}                           