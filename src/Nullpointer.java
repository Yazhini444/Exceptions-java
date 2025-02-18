class Nullpointer {
    public static void main(String[] args) {
        int[] arr = null; // Uninitialized array

        try {
            System.out.println(arr[0]); // Accessing a null array
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
