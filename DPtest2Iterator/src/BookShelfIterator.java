public class BookShelfIterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){//コンストラクタ（初期化）
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public {//hasNextを定義
        if(index < bookShelf.getLength()){

        }else{

        }
    }

    public {//nextを定義
        Book book = bookShelf.getBookAt(index);
        index++;

    }
}
