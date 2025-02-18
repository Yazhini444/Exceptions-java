class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class Custom {
    static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age for voting.");
    }

    public static void main(String[] args) {
        try {
            validateAge(19);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
