package AbhinavSirLabWork.Collection.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorImple {
    public static void main(String[] args) {
        List listOfSong=new ArrayList<>();
        listOfSong.add("Despacito");
        listOfSong.add("Starboy");
        listOfSong.add("Weekend");
        listOfSong.add("Baby");
        System.out.println(listOfSong);
        ListIterator listIterator=listOfSong.listIterator(listOfSong.size());
        while (listIterator.hasPrevious()){
            int index=listIterator.previousIndex();
            Object obj=listIterator.previous();

            System.out.println(obj +" "+index);
        }
    }
}
