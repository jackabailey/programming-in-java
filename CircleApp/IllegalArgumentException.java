// An IllegalArgumentException Class to demonstrate custom-made exceptions

// They allow for more detailed and descriptive errors than the ones Java comes with

public class IllegalArgumentException extends RuntimeException {

  public IllegalArgumentException(String message) {

    super(message);

  }

}
