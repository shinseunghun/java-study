public class wp1 {
    public static void main(String[] args){
        String name = "신승훈";
        int name1 = -1, name2 = -1, name3 = -1;
        
        for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++) {
            if (name.charAt(0) == (char)i) {
                name1 = i;
            }
            if (name.charAt(1) == (char)i) {
                name2 = i;
            }
            if (name.charAt(2) == (char)i) {
                name3 = i;
            }
            
            if (name1 > -1 && name2 > -1 && name3 > -1) {
                break;
            }
        }
    
        System.out.printf("0x%X, 0x%X, 0x%X", name1, name2, name3);
    }
}