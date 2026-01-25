public class MyRunable implements Runnable {

    @Override
    public void run(){

        for(int i=1; i<=10; i++){

            try{
            Thread.sleep(1000);

            }catch (InterruptedException e){
                System.out.println("Thread interrupted");
            }

            if(i == 10){
                System.out.println("\n Times up, You're dead!");
                System.exit(0);
            }

        }

    }

}
