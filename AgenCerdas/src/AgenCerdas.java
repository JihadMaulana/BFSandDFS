
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class AgenCerdas {
    public static void main(String[] args) {
        Node[] graph ;
        BFS bfs;
        DFS dfs;
        Scanner scanner = new Scanner(System.in);
        int jml;
        int jmlfollower;
        String awal;
        String akhir;
        
        System.out.println("Masukan Jumlah Node");
        jml = scanner.nextInt();
        graph = new Node[jml];
        for(int i = 0; i<jml;i++){
            System.out.println("Masukan Node ke = "+(i+1));
            String a = scanner.next();
            System.out.println("Masukan Jumlah follower = ");
            jmlfollower = scanner.nextInt();
            graph[i] = new Node(jmlfollower);
            graph[i].setState(a);
            for(int j=0;j<jmlfollower;j++){
                System.out.println("Masukan Follower ke "+(j+1)+" Node "+graph[i].getState());
                String b = scanner.next();
                graph[i].setEdge(b, j);
            }
        }
        int pilih=99;
        while (pilih!=3) {            
            System.out.println("\nPilih Metode Search : 1.BFS 2.DFS 3.keluar: ");
            pilih = scanner.nextInt();
            if(pilih == 1){
                bfs = new BFS(graph);
                System.out.println("Awal : ");
                awal = scanner.next();
                System.out.println("Akhir : ");
                akhir = scanner.next();

                bfs.proses(awal, akhir, jml);
            }else if(pilih == 2){
                dfs = new DFS(graph);
                System.out.println("Awal : ");
                awal = scanner.next();
                System.out.println("Akhir : ");
                akhir = scanner.next();

                dfs.proses(awal, akhir, jml);
            }    
        }
        
    }
}
