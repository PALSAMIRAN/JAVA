public class question1 {
    private char[] data;
    
    public question1() {
        data = new char[0];
    }
    
    public question1(char[] value) {
        data = value.clone();
    }
    
    public int length() {
        return data.length;
    }
    
    public char charAt(int index) {
        if (index < 0 || index >= data.length) {
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }
    
    public question1 substring(int beginIndex, int endIndex) {
        if (beginIndex < 0 || endIndex > data.length || beginIndex > endIndex) {
            throw new IndexOutOfBoundsException();
        }
        
        char[] subData = new char[endIndex - beginIndex];
        System.arraycopy(data, beginIndex, subData, 0, subData.length);
        
        return new question1(subData);
    }
    
    public boolean equals(question1 other) {
        if (other == null || other.length() != data.length) {
            return false;
        }
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] != other.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public question1 concat(question1 other) {
        char[] newData = new char[data.length + other.length()];
        System.arraycopy(data, 0, newData, 0, data.length);
        System.arraycopy(other.data, 0, newData, data.length, other.length());
        
        return new question1(newData);
    }
    
    
    public String toString() {
        return new String(data);
    }
    
    public static void main(String[] args) {
        question1 str1 = new question1(new char[]{'H', 'e', 'l', 'l', 'o'});
        question1 str2 = new question1(new char[]{' ', 'w', 'o', 'r', 'l', 'd'});
        
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 2 in str1:" + str1.charAt(2));
        
        question1 subStr = str1.substring(1, 4);
        System.out.println("Substring of str1: " + subStr.toString());
        
        System.out.println("str1 equals str2: " + str1.equals(str2));
        
        question1 concatenated = str1.concat(str2);
        System.out.println("Concatenated string: " + concatenated.toString());
    }
}
