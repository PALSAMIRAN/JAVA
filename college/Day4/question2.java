 public class question2 {
        private char[] data;
        private int length;
        
        public question2() {
            data = new char[16];
            length = 0;
        }
        
        public question2(String str) {
            data = new char[str.length() + 16];
            length = str.length();
            str.getChars(0, length, data, 0);
        }
        
        public int length() {
            return length;
        }
        
        public synchronized char charAt(int index) {
            if (index < 0 || index >= length) {
                throw new IndexOutOfBoundsException();
            }
            return data[index];
        }
        
        public synchronized void append(String str) {
            int newLength = length + str.length();
            ensureCapacity(newLength);
            
            str.getChars(0, str.length(), data, length);
            length = newLength;
        }
        
        private void ensureCapacity(int capacity) {
            if (capacity > data.length) {
                int newCapacity = Math.max(data.length * 2, capacity);
                char[] newData = new char[newCapacity];
                System.arraycopy(data, 0, newData, 0, length);
                data = newData;
            }
        }
        
        
        public synchronized String toString() {
            return new String(data, 0, length);
        }
        
        public static void main(String[] args) {
            question2 buffer = new question2("Hello");
            
            System.out.println("Initial buffer: " + buffer.toString());
            System.out.println("Length of buffer: " + buffer.length());
            System.out.println("Character at index 2: " + buffer.charAt(2));
            
            buffer.append(" World");
            System.out.println("Buffer after appending: " + buffer.toString());
        }
    }
    

