
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class DFS {
    private Stack<String[]> listgraph;
    Node[] graph;
    Collection<String> visited;
    String[] jalur;
    String state;
    
    public DFS(Node[] graph){
        this.graph = graph;
    }
    
    void proses(String awal , String akhir , int Jmlnode){
        listgraph = new Stack<String[]>();
        visited = new LinkedList<String>();
        String[] x={awal};
        listgraph.add(x);
        int done = 0;
        
        
        while (!listgraph.isEmpty() && done == 0) {            
            jalur = listgraph.pop();
            state = jalur[jalur.length-1];
            if(state.equals(akhir)){
                done = 1;
            }else if((visited.contains(state))==false){
                for(int i = 0; i<graph[getIndex(state)].getJML();i++){
                    String[] jalur_baru = new String[jalur.length+1];
                    for(int j = 0; j<jalur.length;j++){
                        jalur_baru[j]=jalur[j];
                    }
                    jalur_baru[jalur_baru.length-1] = graph[getIndex(state)].getEdge(i);
                    listgraph.push(jalur_baru);
                }
                visited.add(state);
            }
        }
        if(state.equals(akhir)){
            System.out.println("BFS :");
            for(int c = 0; c<jalur.length;c++){
                System.out.print(" "+jalur[c]);
            }
            System.out.print("\n Visited: "+visited);
            
        }else{
            System.out.println("FOLLOWER dari FOLLOWER TIDAK ADA");
        }
        
        
        
    }
    int getIndex(String state){
        int a = 99;
        for(int i=0;i<graph.length;i++){
            if(state.equals(graph[i].getState())){
                a=i;
            }
        }
        return a;
    }
}
