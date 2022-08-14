public class Thread8 
{  
    public static void main(String[] args) 
    {  
      final String resource1 = "Computer Applications";  
      final String resource2 = "Computer Science";  
      
      // t1 tries to lock resource1 then resource2  
      Thread t1 = new Thread() 
      {  
        public void run() 
        {  
            synchronized (resource1) 
            {  
             System.out.println("Thread 1: locked resource 1 " + resource1);      
             try { Thread.sleep(100);} catch (Exception e) {}      
            
             synchronized (resource2) 
             {  
              System.out.println("Thread 1: locked resource 2 "+ resource2);  
             }  
           }  
        }  
      }; 
      
      // t2 tries to lock resource2 then resource1  
      Thread t2 = new Thread() 
      {  
        public void run() 
        {  
          synchronized (resource2) 
          {  
            System.out.println("Thread 2: locked resource 2 "+ resource2);     
            try { Thread.sleep(100);} catch (Exception e) {}      
          
            synchronized (resource1) 
            {  
              System.out.println("Thread 2: locked resource 1 "+ resource1);  
            }  
          }  
        }  
      };    
      
      t1.start();  
      t2.start();  
    }  
  }   
/*Output: 
Thread 1: locked resource 1 Computer Applications
Thread 2: locked resource 2 Computer Science */