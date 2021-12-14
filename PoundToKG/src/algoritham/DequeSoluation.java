package algoritham;

    import java.util.*;
    public class DequeSoluation {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            Set<Integer> checkUnique = new LinkedHashSet<>();
            
            int n = in.nextInt();
            int m = in.nextInt();
            int min = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                checkUnique.add(num);
                
                if(deque.size()==m){
                    
                    if(checkUnique.size()>min) min = checkUnique.size();
                    int first = deque.remove();
                    if(!deque.contains(first)) checkUnique.remove(first);
                    
                    
                }
                
                
               
            }
            
            System.out.println(m);
        }
    }



