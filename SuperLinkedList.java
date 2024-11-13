import java.util.LinkedList;
import java.util.ListIterator;

public class SuperLinkedList extends LinkedList<String> {
  public boolean removeVowels() {
    boolean changed = false;
    ListIterator<String> list = this.listIterator();
    while (list.hasNext()) {
      String next = list.next().toLowerCase();
      if ("eioua".contains(next)) {
        changed = true;
        list.remove();
      } // end if
    } // end while
    return changed;
  }// end remove vowels

  public boolean removeConsonants() {
    boolean changed = false;
    ListIterator<String> list = this.listIterator();
    while (list.hasNext()) {
      String next = list.next().toLowerCase();
      if ("qwrtypsdfghjklzxcvbnm".contains(next)) {
        changed = true;
        list.remove();
      } // end if
    } // end while
    return changed;
  }// end removeConsonants

  public LinkedList<String> concatenateStrings() {
    LinkedList<String> concat = new LinkedList<String>();
    ListIterator<String> list = this.listIterator();
    String current = "";
    while (list.hasNext()) {
      current += list.next();
      concat.add(current);
    } // end while
    return concat;
  }// end concatenateStrings

  public LinkedList<String> mix(LinkedList<String> list2) {
    ListIterator<String> list = this.listIterator();
    ListIterator<String> list2iter = list2.listIterator();
    LinkedList<String> third = new LinkedList<String>();
    while (list.hasNext()) {
      third.add(list.next());
      third.add(list2iter.next());
    } // end while
    return third;
  }// end mix

  public LinkedList<String> removeDuplicates() {
    LinkedList<String> dupes = new LinkedList<String>();
    ListIterator<String> list = this.listIterator();
    while (list.hasNext()) {
      String next = list.next();
      if (this.toString().lastIndexOf(next) != this.toString().indexOf(next)) {
        dupes.add(next);
        list.remove();
      } // end if
    } // end while
    return dupes;
  }// end removeDuplicates

  public String toString() {
    String out = "";
    ListIterator<String> list = this.listIterator();
    while (list.hasNext())
      out += list.next() + ", ";
    return out;
  }
}// end class