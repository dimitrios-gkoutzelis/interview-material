package main.java.interview.strings;

public class StringBufferVSStringBuilder {

    // String buffer:  A thread-safe, mutable sequence of characters. A string buffer is like a String, but can be modified.
    // At any point in time it contains some particular sequence of characters, but the length and content of the
    // sequence can be changed through certain method calls.

    // StringBuilder: A mutable sequence of characters. This class provides an API compatible with StringBuffer, but
    // with no guarantee of synchronization. This class is designed for use as a drop-in replacement for StringBuffer
    // in places where the string buffer was being used by a single thread (as is generally the case).
    // Where possible, it is recommended that this class be used in preference to StringBuffer as it will be faster
    // under most implementations.

    // In short, both mutable sequences of characters but use the non-thread-safe StringBuilder for speed.
}
