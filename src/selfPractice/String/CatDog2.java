package selfPractice.String;

public class CatDog2 {

    public static void main(String[] args) {

        String str = "caT dog dogG cAt";
        str = str.toLowerCase();
        int cat = 0, dog = 0;

        while(str.contains("cat")){
            str = str.replaceFirst("cat", "violetta");
            cat++;
        }
        while(str.contains("dog")){
            str= str.replaceFirst("dog", "violetta");
            dog++;
        }
        boolean catDog = cat == dog;
        System.out.println(catDog);

    }



}
