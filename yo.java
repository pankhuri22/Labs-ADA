package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

class Graph
{
    private int numVertices;
    private LinkedList<Integer> adjLists[];

    Graph(int vertices)
    {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++)
            adjLists[i] = new LinkedList();
    }

    void addEdge(int src, int dest)
    {
        adjLists[src].add(dest);
    }


public static class yo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int yo[][] = new int[m][2];
        Graph g = new Graph(4);

		for(int i=0;i<m;i++) {
			String[] Array  = reader.readLine().split(" ");
			for(int j=0;j<2;j++) {
				yo[i][j] = Integer.parseInt(Array[j]);
		        g.addEdge(yo[i][j], yo[i+1][j]);


			}

		}








	}

}}
