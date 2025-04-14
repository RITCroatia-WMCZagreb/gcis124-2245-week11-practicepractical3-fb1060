/*
@ASSESSME.USERID: fb1060
@ASSESSME.AUTHOR: 
@ASSESSME.DESCRIPTION: 
@ASSESSME.ANALYZE: YES
*/

public class FunWithThreads1 {


    //Constructor of FunWithThreads
    public FunWithThreads1(){
        System.out.println("MAIN START");
        MyThread t1= new MyThread("1");
        MyThread t2= new MyThread("2");

        Thread th1= new Thread(t1);
        Thread th2= new Thread(t2);

        th1.start();
        th2.start();

      
       
        System.out.println("MAIN END");
    }

    public static void main(String[] args) throws Exception {
        
        new FunWithThreads1();

    }
    class MyThread implements Runnable{
        private String tName;

        public MyThread(String tName){
            this.tName=tName;
        }
    
        

        @Override
        public void run() {
           for(int i=0;i<10;i++){
            System.out.println("Thread " + tName+ " " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           }
        }
        
    }

    /*
     * 
     * 
     * Main Thread START
        Main Thread END
        Thread 1 0
        Thread 2 0
        Thread 1 1
        Thread 2 1
        Thread 1 2
        Thread 2 2
        Thread 1 3
        Thread 2 3
        Thread 1 4
        Thread 2 4
        Thread 1 5
        Thread 2 5
        Thread 1 6
        Thread 2 6
        Thread 1 7
        Thread 2 7
        Thread 1 8
        Thread 2 8
        Thread 1 9
        Thread 2 9
     */


}
