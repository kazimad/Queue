public class Main {


   public static interface Queue{
       public boolean push (int elem);
       public int shift();

   }
    public static class MyQueue implements Queue{
        int head=0;
        int tail=0;
        int size=0;
        int a[];

        public MyQueue(int size){
           this.size=size;
           a = new int [size];

        }
        @Override
        public boolean push(int elem) {

            a[head] = elem;
            head++;
            if (head == size){
                head=0;
            }

            return true;
        }

        @Override
        public int shift() {
            int toreturn=a[tail];
            tail++;
            if (tail==size){
                tail=0;
            }
            return toreturn;
        }
        public boolean chek(){
            return head != tail;

        }
    }







    public static interface Steck {
            public boolean push(int elem);
            public int pop();

        }


        public static class MySteck implements Steck{
            int size=0;
            int head=0;
            int b [];
            public MySteck(int size){
                this.size=size;
                b = new int [size];
            }
            @Override
            public boolean push(int elem) {
                    b[head] = elem;
                    head++;
                    return true;
                }

            @Override
            public int pop() {
                return b[--head];
            }


            public boolean check (){
               if (( head==0)||(head==size)){
                   return false;
               }
               else {return true;}
           }

        }


    public static void main (String []args ){
        MyQueue q = new MyQueue(3);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.shift() + " " + q.chek());
        System.out.println(q.shift()+" "+q.chek());
        System.out.println(q.shift()+" "+q.chek());
        System.out.println(q.shift()+" "+q.chek());

        System.out.println();
        System.out.println();


       MySteck w = new MySteck(3);
        w.push(10);
        w.push(20);
        w.push(30);
        System.out.println(w.pop()+" "+ w.check());
        System.out.println(w.pop()+" "+ w.check());
        System.out.println(w.pop()+" "+ w.check());

    }


}