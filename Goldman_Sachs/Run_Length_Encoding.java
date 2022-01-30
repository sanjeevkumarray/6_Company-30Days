// { Driver Code Starts
    import java.util.*;
 
    class RLEncoding
    {
       public static void main(String[] args) 
       {
     
          Scanner scn = new Scanner(System.in);
        
          int T = scn.nextInt();
          sc.nextLine();
          while(T>0)
          {
              
            String str = scn.nextLine();
            
            GfG g = new GfG();
            System.out.println(g.encode(str));
            
          
            T--;
          }
       }
    }
    
    // } Driver Code Ends
    
    
    class GfG
     {
        String encode(String str)
        {
              //Your code here
                char[] ch = str.toCharArray();
              int cnt = 1;
              StringBuilder sb = new StringBuilder("");
              sb.append(ch[0]);
              for(int i = 1; i< ch.length;i++){
                  if (ch[i] == ch[i-1]){
                      cnt++;
                  }else{
                      sb.append(cnt);
                      cnt = 1;
                      sb.append(ch[i]);
                  }
              }
              sb.append(cnt);
              return sb.toString();
        }
        
     }