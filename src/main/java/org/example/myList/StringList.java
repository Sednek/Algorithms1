package org.example.myList;

import org.example.myList.exception.IndexMoreThanLengthException;
import org.example.myList.exception.NotFoundItemException;

import java.util.Arrays;

public class StringList implements MyList{

    private final int INIT_SIZE = 0;
    private String[] StringList = new String[INIT_SIZE];
    private int pointer = 0;


    public StringList() {
    }

    public MyList makeStringListForTests(String[] data, MyList list){
        for (String datum : data) {
            list.add(datum);
        }
        return list;
    }

    @Override
    public String add(String item) {
        if (this.StringList.length == 0) {
            resize(this.StringList.length + 1);
        }
        if (pointer == this.StringList.length) {
            resize(this.StringList.length + 1);
        }
        this.StringList[pointer++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (index > this.StringList.length - 1) {
            throw new IndexOutOfBoundsException("Индекс, на который вы хотите втиснуть указанный элемент, больше размера списка");
        }
        resize(this.StringList.length + 1);
        System.arraycopy(this.StringList, index, this.StringList, index + 1, pointer - index);
        this.StringList[index] = item;
        pointer++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        if (index > this.StringList.length - 1) {
            throw new IndexOutOfBoundsException("Индекс, на который вы хотите поместить элемент, больше размера списка");
        }
        this.StringList[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        boolean ItemContains = false;
        int i = 0;
        for (; i < this.StringList.length; i++) {
            if (item.equals(this.StringList[i])) {
                ItemContains = true;
                break;
            }
        }
        if (ItemContains) {
            System.arraycopy(this.StringList, i + 1, this.StringList, i, pointer - i - 1);
            pointer--;
            resize(this.StringList.length - 1);
        } else {
            throw new NotFoundItemException("Указанный элемент не найден в списке");
        }

        return item;
    }

    @Override
    public String remove(int index) {
        if (index > this.StringList.length - 1) {
            throw new IndexMoreThanLengthException("Указанный индекс больше чем размер массива");
        }
        System.arraycopy(this.StringList, index + 1, this.StringList, index, pointer - index - 1);
        pointer--;
        resize(this.StringList.length - 1);
        return this.StringList[index];
    }

    @Override
    public boolean contains(String item) {
        for (String s : this.StringList) {
            if (item.equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        boolean ItemContains = false;
        int i = 0;
        for (; i < this.StringList.length; i++) {
            if (item.equals(this.StringList[i])) {
                ItemContains = true;
                break;
            }
        }
        if (ItemContains) {
            return i;
        } else {
            return -1;
        }
    }

    @Override
    public int lastIndexOf(String item) {
        boolean ItemContains = false;
        int i = this.StringList.length - 1;
        for (; i > -1; i--) {
            if (item.equals(this.StringList[i])) {
                ItemContains = true;
                break;
            }
        }
        if (ItemContains) {
            return i;
        } else {
            return -1;
        }
    }

    @Override
    public String get(int index) {
        if (index > this.StringList.length - 1) {
            throw new IndexMoreThanLengthException("Указанный индекс больше чем размер массива");
        }
        return this.StringList[index];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StringList)) return false;
        StringList that = (StringList) o;
        return Arrays.equals(StringList, that.StringList);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(StringList);
    }

    @Override
    public int size() {
        return this.StringList.length;
    }

    @Override
    public boolean isEmpty() {
        return this.StringList.length == 0;
    }

    @Override
    public void clear() {
        this.StringList = new String[INIT_SIZE];
        pointer = 0;
    }

    @Override
    public String[] toArray() {
        String[] arr = new String[pointer];
        System.arraycopy(this.StringList, 0, arr, 0, pointer);
        return arr;
    }

    @Override
    public String toString() {
        return "[" + String.join(", ", this.StringList) + "]";
    }

    private void resize(int newLength) {
        String[] newArray = new String[newLength];
        System.arraycopy(this.StringList, 0, newArray, 0, pointer);
        this.StringList = newArray;
    }
}