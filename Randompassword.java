import java.util.Random;

public class Randompassword {
    public static void main(String[] args) {
        String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower ="abcdefqghijklmnopqrstuvwxyz";
        String num="0123456789";
        String spchar="<>,;';@#${}[](-+*/^_-&!)";
        String combo=upper+lower+spchar+num;
        int len=8;
        char [] password = new char[len];
        Random rand = new Random();
        for(int i =0;i<len;i++){
            password[i] = combo.charAt(rand.nextInt(combo.length()));
        }
        System.out.println("Here the new Password:" +new String(password));
    }
}
