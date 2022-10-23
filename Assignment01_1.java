package in.ineuron.main;

public class Assignment01_1 {

	public static void main(String[] args) {
		int n = 7;
		for (int i = 0; i < n; i++) {
	/*S*/		for (int j=0;j<n;j++)
			{
				if(i==0&&j>0&&j<((3*n)/4)||
				j==0&&i>0&&i<(n-1)/2||
				i==(n-1)/2 && j>0 &&j<(3*n)/4||
				j==(3*n)/4&&i>0&&i<n/4&&i>(n-1)/2&&i<n-1||
				i==n-1 &&j>0&& j<(3*n)/4||
				j==(3*n)/4&&i>(n-1)/2&&i<n-1||
				i>0&&i<=n/4&&j==(3*n)/4||
				i>=(3*n)/4&&j==0&&i!=n-1)
					System.out.print("S");
				else
					System.out.print(" ");
			}
	/*U*/		 for(int j=0;j<n;j++) {
				 if(j==0&&i!=n-1||
					j==(3*n)/4 &&i!=n-1||
					i==n-1&&j>0&&j<(3*n)/4	 )
					 System.out.print("U");
					else
						System.out.print(" "); 
			 }
		/*B*/	 for(int j=0;j<n;j++) {
				 if(j==0||
					i==0&&j<(3*n)/4||
					i==(n-1)/2 &&j<(3*n)/4||
					i==n-1&&j<(3*n)/4||
					j==(3*n)/4&&i!=0&&i!=(n-1)/2&&i!=n-1)
					 System.out.print("B");
					else
						System.out.print(" "); 
			 }
		/*R*/	 for(int j=0;j<n;j++) {
				 if(j==0||
					i==0&&j<(3*n)/4||
					i==(n-1)/2&&j<(3*n)/4||
					j==(3*n)/4&&i>0&&i<(n-1)/2||
					i-j==(n-1)/4&&i>(n-1)/2)
					 System.out.print("R");
					else
						System.out.print(" "); 
			 }
		/*A*/ for(int j=0;j<n;j++) {
				 if(j==0&&i>0||
					j==(3*n)/4&&i>0||
					i==(n-1)/2&&j<(3*n)/4||
					i==0&&j>0&&j<(3*n)/4)
					 System.out.print("A");
					else
						System.out.print(" "); 
			 }
		/*H*/ for(int j=0;j<n;j++) {
				 if(j==0||
					j==(3*n)/4||
					i==(n-1)/2&&j<(3*n)/4)
					 System.out.print("H");
					else
						System.out.print(" "); 
			 }
		/*M*/	 for(int j=0;j<n;j++) {
				 if(j==0||
					j==n-1||
					i==j&&j<=(n-1)/2||
					i+j==n-1&& j>=(n-1)/2&&j<n-1)
					 System.out.print("M");
					else
						System.out.print(" "); 
			 }
		         for(int j=0;j<n/4;j++) {
	        	 System.out.print(" ");
	             }
		/*A*/	 for(int k=0;k<n;k++) {
				 if(k==0&&i>0||
					k==(3*n)/4&&i>0||
					i==(n-1)/2&&k<(3*n)/4||
					i==0&&k>0&&k<(3*n)/4)
					 System.out.print("A");
					else
						System.out.print(" ");
			 }
		/*N*/	 for(int j=0;j<n;j++) {
				 if(j==0||
					j==n-1||
					i==j)
					 System.out.print("N");
					else
						System.out.print(" "); 
			 }
		/*Y*/	 for(int j=0;j<n;j++) {
				 if(i==j&&j<=(n-1)/2||
					i+j==n-1&&j>=(n-1)/2||
					j==(n-1)/2 &&i>=(n-1)/2)
					 System.out.print("Y");
					else
						System.out.print(" "); 
			 }
		/*A*/	 for(int l=0;l<n;l++) {
				 if(l==0&&i>0||
					l==(3*n)/4&&i>0||
					i==(n-1)/2&&l<(3*n)/4||
					i==0&&l>0&&l<(3*n)/4)
					 System.out.print("A");
					else
						System.out.print(" ");
			 }
		         for(int j=0;j<n/2;j++) {
       	         System.out.print(" ");
                 }
		/*I*/	 for(int j=0;j<n;j++) {
				 if(i==0||i==(n-1)||j==(n-1)/2)
					 System.out.print("I");
					else
						System.out.print(" ");
			 }
		         for(int j=0;j<n/4;j++) {
		        	 System.out.print(" ");
		         }
		/*N*/	 for(int m=0;m<n;m++) {
				 if(m==0||
					m==n-1||
					i==m)
					 System.out.print("N");
					else
						System.out.print(" "); 
			 }   
		          for(int j=0;j<n/4;j++) {
  	              System.out.print(" ");
                  }
		/*E*/	 for(int j=0;j<n;j++) {
				 if(i==0||i==(n-1)||j==0||i==(n-1)/2)
					 System.out.print("E");
					else
						System.out.print(" ");
			 }
		        for(int j=0;j<n/4;j++) {
  	            System.out.print(" ");
                }
		/*U*/	 for(int p=0;p<n;p++) {
				 if(p==0&&i!=n-1||
					p==(3*n)/4 &&i!=n-1||
					i==n-1&&p>0&&p<(3*n)/4	 )
					 System.out.print("U");
					else
						System.out.print(" "); 
			 }
		/*R*/	 for(int q=0;q<n;q++) {
				 if(q==0||
					i==0&&q<(3*n)/4||
					i==(n-1)/2&&q<(3*n)/4||
					q==(3*n)/4&&i>0&&i<(n-1)/2||
					i-q==(n-1)/4&&i>(n-1)/2)
					 System.out.print("R");
					else
						System.out.print(" "); 
			 }
		/*O*/	 for(int j=0;j<n;j++) {
				 if(i==0&&j>0&&j<n-1||j==0&&i>0&&i<n-1||i==n-1&&j>0&&j<n-1||j==n-1&&i>0&&i<n-1)
					 System.out.print("O");
					else
						System.out.print(" ");
			 }
		         for(int j=0;j<n/4;j++) {
  	             System.out.print(" ");
                 }
		/*N*/	 for(int r=0;r<n;r++) {
				 if(r==0||
					r==n-1||
					i==r)
					 System.out.print("N");
					else
		 			System.out.print(" ");
			 }	 
			System.out.println();
		}

	}

}
		
