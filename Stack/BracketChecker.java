package Stack;

public class BracketChecker {
     private  String input;
     public  BracketChecker(String in){
         input =in;

     }
     public  void  chack(){
         int  stackSize=input.length();
         StackX theStack=new StackX(stackSize);


         for (int i = 0; i < input.length(); i++) {
             char ch=input.charAt(i);
             switch (ch){
                 case '{':
                 case '[':
                 case '(':
                     theStack.push(ch);
                     break;
                 case '}':
                 case ']':
                 case ')':

                     if (!theStack.isEmpty()){
                         char poped=theStack.pop();
                         if ((ch=='}'&& poped !='{')||(ch =='['&& poped!=']')||(ch==')'&& poped!='('))
                             System.out.println("Hata: Yanlıs Parantez:"+ch+" İndis:"+i);


                     }else
                         System.out.println("Hata: Fazla Parantez Kapatılmiş:"+ch+" İndis: "+i);
                     break;

         }

         }

         if (!theStack.isEmpty())
             System.out.println("Hata: Sağ Parantez Eksik");

     }


}
