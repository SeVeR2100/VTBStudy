package lesson_6;

public class Main {
    private static final int SIZE = 1_000_000;
    private static final int HALF = SIZE / 2 ;


    public static void main(String[] args) throws InterruptedException {
        getOneThreadArray();
        getTwoThreadArray();
    }

    public static void getOneThreadArray(){
        long a = System.currentTimeMillis();
        float [] array = new float [SIZE];
        for(int i=0;i< array.length;i++){
            array[i]=1;
        }
        System.out.println("Заполнение единицами: "+a+" метод 1");
        for(int i=0;i< array.length;i++){
            array[i]= (float) (array[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) *
            Math.cos( 0.4f + i/2 ));
        }
        System.out.println("Заполнение по формуле: "+(System.currentTimeMillis()-a)+" метод 1");
    }

    public static void getTwoThreadArray() throws InterruptedException {
        long a = System.currentTimeMillis();
        float [] array = new float [SIZE];
        for(int i=0;i< array.length;i++){
            array[i]=1;
        }
        System.out.println("Заполнение единицами: "+a+" метод 2");
        float[] firstHalfArray = new float[HALF];
        float[] secondHalfArray = new float[HALF];
        System.arraycopy(array, 0, firstHalfArray, 0, HALF);
        System.arraycopy(array, HALF, secondHalfArray, 0, HALF);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i< firstHalfArray.length;i++){
                    firstHalfArray[i]= (float) (firstHalfArray[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) *
                            Math.cos( 0.4f + i/2 ));
                }
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0,j=HALF;i< secondHalfArray.length;i++,j++){
                    secondHalfArray[i]= (float) (secondHalfArray[i] * Math.sin(0.2f + j/5) * Math.cos(0.2f + j/5) *
                            Math.cos( 0.4f + j/2 ));
                }
            }

        });
        thread2.start();
        thread1.join();
        thread2.join();
        System.arraycopy(firstHalfArray, 0, array, 0, HALF);
        System.arraycopy(secondHalfArray, 0, array, HALF, HALF);
        System.out.println("Заполнение по формуле: "+(System.currentTimeMillis()-a)+" метод 2");
    }


}
