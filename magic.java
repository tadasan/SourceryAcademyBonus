class MagicNumber {
      public static void main( String args[] ){ 
            long NUMBER = 142857; //Skačius, kurį tikriname
            
            String res =isMagic(NUMBER) ? "yra" : "nėra";
            System.out.print(String.format("Duotasis skaičius %s magiškas", res));
        }

        static boolean isMagic(long num) {
            int length = String.valueOf(num).length()+1;
            int top = (int)Math.pow(10, length-1)-1;

        return (num*length == top);
      }
    }