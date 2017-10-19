public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){//コンストラクタ（初期化）
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext(){//hasNextを定義
        if(index < bookShelf.getLength()){
            return true;
        }else{
            return false;
        }
    }

    public Object next(){//nextを定義
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
