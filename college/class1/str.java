class str{
    public static void main(String [] args){
        String str = "Hello";
        System.out.println(str);
        String str2 = new String("Hii");
        System.out.println(str2);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(0));
        System.out.println(str.substring(0,2));
        System.out.println(str.equals(str2));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.contains("He"));//checks if char are there or not 
        System.out.println(str.replace('o','p'));
        str.concat("qwerty");  //string is immutable
        System.out.println(str);
        String str3 = str.concat("qwerty");
        System.out.println(str);
        System.out.println(str3);

    
    }
}