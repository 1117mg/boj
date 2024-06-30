package baekjoon_roadmap.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _1197 {
    // 1197 최소 스패닝 트리 - 프림 알고리즘
    static class Node implements Comparable<Node>{
        int to,cost;

        public Node(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return cost - o.cost;
        }
    }
    static int V,E;
    static ArrayList<Node>[] adjList; // 인접리스트
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        adjList = new ArrayList[V + 1];
        for(int i = 1; i<=V; i++){
            adjList[i] = new ArrayList<>();
        }
        visited = new boolean[V + 1];
        for(int i = 0; i<E; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            adjList[from].add(new Node(to, cost));
            adjList[to].add(new Node(from, cost));
        }
        System.out.println(prim());
    }
    public static int prim(){
        int sum = 0;
        int cnt = 0;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(1, 0));
        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if(visited[cur.to]) continue;
            sum += cur.cost;
            visited[cur.to] = true;
            if(++cnt == V) return sum;
            for(Node n : adjList[cur.to]){
                if(visited[n.to]) continue;
                pq.add(n);
            }
        }
        return sum;
    }
}