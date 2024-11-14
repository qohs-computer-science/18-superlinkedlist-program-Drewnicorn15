class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList SSL1 = new SuperLinkedList();
    SSL1.add("a");
    SSL1.add("b");
    SSL1.add("c");
    SSL1.add("b");
    SSL1.add("a");
    System.out.println("this is list 1:");
    System.out.println(SSL1);
    SuperLinkedList SSL2 = new SuperLinkedList();
    SSL2.add("a");
    SSL2.add("b");
    SSL2.add("c");
    SSL2.add("d");
    SSL2.add("e");
    System.out.println("this is list 2:");
    System.out.println(SSL2);
    SuperLinkedList SSL3 = new SuperLinkedList();
    SSL3.add("A");
    SSL3.add("E");
    SSL3.add("B");
    SSL3.add("F");
    SSL3.add("X");
    System.out.println("this is list 3:");
    System.out.println(SSL3);
    System.out.println("it is " + SSL3.removeConsonants() +" that consonants were removed from list 3. it now looks like: ");
    System.out.println(SSL3);
    System.out.println("it is " + SSL2.removeVowels() +" that vowels were removed from list 2. it now looks like: ");
    System.out.println(SSL2);
    System.out.println("it is " + SSL3.removeConsonants() +" that consonants were removed from list 3. it now looks like: ");
    System.out.println(SSL3);
    System.out.println("List 1 concatenated: "+ SSL1.concatenateStrings());
    SSL3.add("O");
    System.out.println("List 2 and 3 mixed: "+ SSL2.mix(SSL3));
    System.out.println("the dupelcated: " +SSL1.removeDuplicates() +" were removed leaving "+ SSL1);
  } // end main
} // end class