import java.io.*;
import java.util.*;

public class S4 {

	public static class Edge implements Comparable<Edge> {

		int bv;
		int ev;
		int cost;
		int a;

		public Edge(int bv, int ev, int cost, int a) {
			this.bv = bv;
			this.ev = ev;
			this.cost = cost;
			this.a = a;
		}

		public int compareTo(Edge o) {
			return this.cost - o.cost;
		}

	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int D = sc.nextInt();
		
		Edge[] edges = new Edge[M];
		
		for (int i=0; i<M; i++) {
			int bv = sc.nextInt()-1;
			int ev = sc.nextInt()-1;
			int cost = sc.nextInt();
			int a = 1;
			if (i<N-1) {
				a = 0;
			}
			edges[i] = new Edge(bv, ev, cost, a);
		}
		
		
		Arrays.sort(edges);
		
		parent = new int [N];
		Arrays.fill(parent, -1);
		
		int count = 0;
		int la = 0;
		int lc = 0;
		int index = 0;
		
		for (int i=0; i<M; i++) {
			int pb = find(edges[i].bv);
			int pe = find(edges[i].ev);
			if (pb!=pe) {
				union(pb, pe);
				count += edges[i].a;
				index++;
				if (index==N-1) {
					la = edges[i].a;
					lc = edges[i].cost;
					break;
				}
			}
		}
		
		if (la==1) {
			Arrays.fill(parent, -1);
			for (int i=0; i<M; i++) {
				int pb = find(edges[i].bv);
				int pe = find(edges[i].ev);
				if (pb!=pe) {
					if (edges[i].cost<lc || (edges[i].cost==lc && edges[i].a==0)) {
						union(pb,pe);
						index++;
					} else if (edges[i].cost>lc && edges[i].a==0 && edges[i].cost<=D){   
						count--;
						break;
					}
				}  
			}
		}
		System.out.println(count);
	}

	public static int[] parent;
	public static int find(int v) {
		if (parent[v] == -1)
			return v;
		parent[v] = find(parent[v]);
		return parent[v];
	}

	public static void union(int bvroot, int evroot) {
		parent[bvroot] = evroot;
	}
}