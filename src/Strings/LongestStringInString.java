package Strings;

public class LongestStringInString {

    public static void main(String[] args) {
        String sentence = "Today is the happiest day of my life";
        String[] word = sentence.split(" ");
        String rts = " ";
        for (int i = 0; i < word.length; i++) {
                if (rts.length() <=word[i].length()) {
                    rts = word[i];
                }
        }
        System.out.println(rts);
        System.out.println(rts.length());
    }
}

/*
* for (int i=0;i<word.length;i++){
   if(word[i].length()>=rts.length()){
      rts=word[i];
   }
}*/