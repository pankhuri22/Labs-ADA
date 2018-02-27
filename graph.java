//package okay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

 class graph {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
String[] inp=reader.readLine().split(" ");
int m=Integer.parseInt(inp[1]);

HashMap<Integer, HashSet<Integer>> n=new HashMap<Integer,HashSet<Integer>>();
for(int a=0;a<m;a++)
{
	String[] p=reader.readLine().split(" ");
	int aa =Integer.parseInt(p[0]);

	int b=Integer.parseInt(p[1]);
	if(!n.containsKey(aa))
	{ HashSet<Integer> j=new HashSet<Integer>();
j.add(b);
j.add(aa);
n.put(aa, j);
}
	else 
	{
		n.get(aa).add(b);
	}
	if(!n.containsKey(b))
	{ HashSet<Integer> j=new HashSet<Integer>();
j.add(aa)	;
j.add(b);

n.put(b, j);
}
	else 
	{
		n.get(b).add(aa);
	}
	
}
boolean goo=true;
for(Integer h :n.keySet())
{
	
	HashSet<Integer> i=n.get(h);
	for(Integer aaa:i)
	{
		
		for(Integer p:n.get(aaa))
		{
		if(!i.contains(p))
		{
			goo=false;
			break;

		}}
	}
	{
	}
}
if(goo)
{
System.out.println("YES");
}
else {
	System.out.println("NO");

}

	}

}
