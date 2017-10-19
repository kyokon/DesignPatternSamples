public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize){//本の最大個数の設定　
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index){//indexを指定された本を返す
        return books[index];
    }
    public void appendBook(Book book) {//本を登録するためのもの、配列の最後に入れて、ポインタを一つずらす
        this.books[last] = book;
        last++;
    }
    public int getLength(){//長さ（最後尾)を返す
        return last;
    }
    //BookShelfに対応するイテレータをつくるためのもの
    //課題ここから
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
    //ここまで
}
