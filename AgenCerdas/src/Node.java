/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Node {
    
   private String state;
   private String[] edge;
   private int jmledge;
   
   public Node(int jmledge){
       this.jmledge = jmledge;
       this.edge = new String[jmledge];
   }
   
   void setState(String state){
       this.state = state;
   }
   void setEdge(String edge , int posisi ){
       this.edge[posisi] = edge; 
   }
   void setJML(int jmledge){
       this.jmledge = jmledge;
   }
   
   String getState(){
       return state;
   }
   String getEdge(int x){
       return edge[x];
   }
   int getJML(){
       return jmledge; 
   }
}
