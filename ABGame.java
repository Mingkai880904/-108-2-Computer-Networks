import java.util.*;


public class ABGame{
	public static void main(String[] argv){
		int[] data = new int[4];
		for(int i=0;i<4;i++){
			int n=1,d=0;
			while (n==1){
				n=0;
				d =(int)(Math.random()*10);
				for(int j=0;j<i;j++){
				if(d==data[j]) n=1;				
 				}
			}
			data[i]=d;
		}
		int inputNum=0,A=0,B=0,num=0;
		int[] input = new int[4];
		System.out.println("請輸入四個數:");
		while(A!=4){
			inputNum=0;A=0;B=0;
			Scanner in = new Scanner(System.in);
			inputNum = in.nextInt();
			input[0]=inputNum/1000;
			input[1]=(inputNum/100)%10;
			input[2]=(inputNum/10)%10;
			input[3]=inputNum%10;
			for(int i=0;i<4;i++){
			    for(int j=0;j<4;j++){
				if(data[i]==input[j]){
					if(i==j) A++;
					else B++;
				}		
			}
		}	
		System.out.print(A+"A"+B+"B");
		System.out.println(" ");
		num++;
	}
	System.out.println("恭喜答對!!!!!!! 共猜"+num+"次");
	}
}




















