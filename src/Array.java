class Array {
    public static void main(String[] args) {
        int[] arr = {2,4,6};

        try {
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
