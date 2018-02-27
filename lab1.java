//pankhuri kasliwal
//2016253


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

  public static void main(String[] args) throws IOException {
    //String words = "hello world, i am a java program, how are you today?";
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(reader.readLine());
	  Boolean flag=true;
	  for(int i=0;i<T;i++) {
		 flag=true;
		  String st = reader.readLine();

		String hello = func(st,'d');
		if(hello.charAt(0) != 'a') {
			System.out.println("Invalid");
			//break;
			continue;
		}
		for(int j=0;j<hello.length();j++) {
			if(hello.charAt(j) == 'a') {
				if(j==hello.length()-1) {
					continue;
				}
				else if(hello.charAt(j+1) == 'a' ) {
					continue;
				}
				else if(j < hello.length()-2 && hello.charAt(j+1) == 'b' && hello.charAt(j+2) == 'b') {
					continue;
				}
				else {
					System.out.println("Invalid");
					flag=false;
					//return;
				}


				}


			}
		if(flag) {
		for(int k = 0;k<hello.length()-1;k++) {
			if(hello.charAt(k) == 'b' && hello.charAt(k+1) == 'b') {
				if(k == hello.length()- 2) {
					continue ;
				}
				else if(hello.charAt(k+2) == 'a') {
					continue ;
				}
				else {
					System.out.println("Invalid");
					flag=false;
					//return ;

				}
			}

		}
		if (flag)
		System.out.println("Valid");
		}
	  }
	  }





  public static String func(String str, char c ){
	//  int i =0 ;

		int first = (int)str.charAt(0);
		int second = (int)str.charAt(1);
	//	System.out.print(first - second);
		String news = null ;
		if(str.length() == 2) {
			if(Math.abs(first-second) < 4) {
				if(c == 'b') {
					news = "bb" ;

				}
				else {
					news = "aa";
				}
				//System.out.println(news);
			}
			else if(first-second > 0) {
				news = "ba" ;
			}
			else {
				news = "ab" ;
			}
			return news;
		}
		if(Math.abs(first-second) < 4) {
			if(c == 'b') {
				news = "bb" ;

			}
			else {
				news = "aa";
			}
			//System.out.println(news);
		}
		else if(first-second > 0) {
			news = "ba" ;
		}
		else {
			news = "ab" ;
		}

		{
			return news + (func(str.substring(1),news.charAt(news.length()-1)));
		}
	}


}
