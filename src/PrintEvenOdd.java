public class PrintEvenOdd {
    int start=1;
    int end=100;

    synchronized void printEven(){
        while(start <= end){

            while (start%2 != 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(start <= end){
                System.out.println("even number printed from " + Thread.currentThread().getName() + " : " + start);
                start++;
                notify();
            }
        }

    }

    synchronized void printOdd(){
        while(start <= end){

            while (start%2 == 0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if(start <= end){
                System.out.println("odd number printed from " + Thread.currentThread().getName() + " : " + start);
                start++;
                notify();
            }
        }
    }
}
