package lesson_4.list;

import java.util.LinkedList;

public class OneSideList<T> {
    private Link<T> first = null;

    public T getFirst(){
        return first.item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private class Link<T>{
        private T item;
        private Link<T> next;

        public Link(T item){
            this.item=item;
        }
    }
}
