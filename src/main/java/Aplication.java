public class Aplication {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Apple",'p'));
        System.out.println(findWordPosition("Helloween","Hello"));
        System.out.println(findWordPosition("Helloween","low"));
        System.out.println(stringReverse("Mama"));
        System.out.println(isPalindrome("ava"));
        System.out.println(isPalindrome("java"));
    }
    //2. Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ.
    // Необхідно обчислити, скільки разів символ зустрічається
    // в переданому рядку і повернути це числове значення.
    //
    public static int findSymbolOccurance(String str, char ch){
        int count=0;
        for(char c : str.toCharArray()){
            if(ch == c) {
                count++;
            }
        }
        return count;
    }
    //3. Створити метод findWordPosition. Метод приймає як параметри два рядки
    // (source, target). Необхідно з'ясувати, чи є target (підрядок)
    // частиною рядка source. Якщо так, тоді повернути номер позиції (індекс)
    // першого елемента підрядка у рядку, інакше повернути -1.
    public static int findWordPosition(String source, String target){
        int position = source.indexOf(target);
        return position;
    }
    //4. Створити метод stringReverse. Метод приймає як параметр - рядок.
    // Необхідно її розгорнути та повернути змінений варіант.
    //Наприклад:
    //Hello -> olleH
    public static String stringReverse(String str){
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    //5. Створити метод isPalindrome. Метод приймає як параметр - рядок.
    // Необхідно Перевірити, чи є переданий рядок паліндромом. Якщо так,
    // тоді повернуть true, інакше false.
    //Приклад 1:
    //ERE -> true
    //Приклад 2:
    //Allo -> false
    public static boolean isPalindrome(String str){
        String reversed = stringReverse(str);
        return str.equalsIgnoreCase(reversed);
    }
}
